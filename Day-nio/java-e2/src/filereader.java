import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereader implements Runnable{
    private String fileName;

    public filereader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println("Thread:" + currentThread.getName() + ", File:"+ fileName+ ",data:"+ line);


            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
