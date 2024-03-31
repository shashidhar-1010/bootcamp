//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{
        runnable r1 = new runnable(5);
        Thread t1 = new Thread(r1);
        t1.start();
        t1.join();

        runnable r2 = new runnable(10);
        Thread t2 = new Thread(r1);
        t2.start();
        //t2.join();
    }
}

