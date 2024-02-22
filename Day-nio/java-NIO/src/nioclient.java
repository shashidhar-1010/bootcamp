import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
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

public class nioclient {
    public static void main(String[] args) {
        try {
            SocketChannel clientChannel = SocketChannel.open();
            SocketChannel.bind(new InetSocketAddress("localhost",5454));
            ByteBuffer buffer = ByteBuffer.allocate(256);
            String str = "ping nioserevr";

            buffer.clear();
            buffer.put(str.getBytes());
            buffer.flip();

            while(buffer.hasRemaining()){
                clientChannel.write(buffer);
            }
            buffer.clear();


            clientChannel.read(buffer);
            buffer.flip();

            String str1 = new String(buffer.array());
            System.out.println("buffer string");




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
