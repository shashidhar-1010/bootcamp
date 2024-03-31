import java.time.LocalDateTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        Runnable runtask = () ->{
            try{
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("current time::" + LocalDateTime.now());
        }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            };

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(runtask);

        executor.shutdown();


        Runnable run = () ->{
            try{
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("current time::" + LocalDateTime.now());
                for(int i=0 ;i<=5;i++){
                    System.out.println("hii"+i);
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        };

        ExecutorService exe = Executors.newFixedThreadPool(3);
        exe.execute(run);
        exe.execute(run);
        exe.execute(run);

        executor.shutdown();


    }

}