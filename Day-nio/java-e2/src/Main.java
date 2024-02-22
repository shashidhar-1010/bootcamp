import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExecutorService excservice = Executors.newCachedThreadPool();

        String[] fileNames = {"file1.txt","file2.txt","file3.txt"};
        for(String fileName : fileNames){
            excservice.submit(new filereader(fileName));
        }

        excservice.shutdown();

    }
}