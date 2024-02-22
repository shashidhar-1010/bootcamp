import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;

public class nioserver {
    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            ServerSocketChannel serverchannel = ServerSocketChannel.open();
            serverchannel.bind(new InetSocketAddress("localhost",5454));


            serverchannel.configureBlocking(false);
            serverchannel.register(selector,SelectionKey.OP_ACCEPT);
            ByteBuffer buffer = ByteBuffer.allocate(256);
            System.out.println("Server started and lestening to port 5454");

            while(true){
                selector.select();
                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> iter = selectedKeys.iterator();
                while(iter.hasNext()){
                    SelectionKey key = iter.next();
                    if(key.isAcceptable()){
                        ServerSocketChannel server = (ServerSocketChannel) key.channel();
                        SocketChannel clientchannel = server.accept();
                        clientchannel.configureBlocking(false);
                        clientchannel.register(selector,SelectionKey.OP_READ);

                    }

                    else if (key.isReadable()){

                        SocketChannel client = (SocketChannel) key.channel();
                        int bytesRead = client.read(buffer);
                        if(bytesRead == -1){
                            key.cancel();
                            client.close();
                            continue;
                        }

                        buffer.flip();
                        String receivedMessage = new String(buffer.array());
                        System.out.println("messaged recieved "+receivedMessage);
                        client.write(buffer);

                    }
                    iter.remove();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}
