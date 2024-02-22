import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number::");
        int n = sc.nextInt();


        ExecutorService exe = Executors.newSingleThreadExecutor();
        sum s = new sum(n);

        Future<?> future = exe.submit(s);

        try{
            future.get();
            System.out.println("sum of natural numbers up to "+ n+" is:"+s.getSum());

        }
        catch(Exception e){
            e.printStackTrace();
        }

        exe.shutdown();
        sc.close();

    }
}