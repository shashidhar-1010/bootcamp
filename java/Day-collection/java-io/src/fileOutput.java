import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class fileOutput {
    public static void main(String... args) throws IOException {
        OutputStream output = new FileOutputStream("output.txt");
        String data = "write this in output file";
        output.write(data.getBytes());
        output.close();


    }
}
