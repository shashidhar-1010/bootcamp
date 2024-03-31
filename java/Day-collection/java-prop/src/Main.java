import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) throws IOException {
        FileReader reader = new FileReader("db.properties");
        Properties props = new Properties();
        props.load(reader);
        System.out.println(props.getProperty("username"));
    }


}