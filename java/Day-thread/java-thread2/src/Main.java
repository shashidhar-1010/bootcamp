//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) throws InterruptedException {
        run r1 = new run("thread1");
        Thread t1 = new Thread(r1);
        t1.start();
        t1.join();

        run r2 = new run("thread2");
        Thread t2 = new Thread(r2);
        t2.start();



    }
}