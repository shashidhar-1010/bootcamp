import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class bufferDemo {
    public static void main(String[] args) {
        String filename = "testfile.txt";
        Path filepath = Paths.get(filename);
        //writeFile(filePath);
        //readFile(filePath);
    }

    private static void writeFile(Path filePath) {
        String input = "this text will be written from java code";
        System.out.println("writing text:" + filePath.getFileName() + " :: " + input);
        byte[] inputbytes = input.getBytes();

        ByteBuffer writer = ByteBuffer.wrap(inputbytes);

        FileChannel writechannel = null;
        try {

            writechannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            int npOfBytesWritten = writechannel.write(writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                try {
                    writechannel.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                System.out.println("completed the write:::");
            }
        }

    }
    private static void readFile(Path filePath){
        FileChannel readChannel = null;
        try{
            readChannel = FileChannel.open(filePath);
            ByteBuffer readBuffer = ByteBuffer.allocate(Math.toIntExact(readChannel.size()));
            readChannel.read(readBuffer);

            byte[] bytes = readBuffer.array();
            String output = new String(bytes);
            System.out.println("Text from the file"+ filePath.getFileName()+" "+output);


        }catch(IOException e){
            throw new RuntimeException(e);

        }finally{
            try {
                readChannel.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
