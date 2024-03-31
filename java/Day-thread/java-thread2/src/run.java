public class run implements Runnable{
    private Thread t;
    private String threadname;

    public run(String threadname){
        this.threadname=threadname;
        System.out.println("creating"+threadname);
    }

    @Override
    public void run() {
        System.out.println("thread is running "+threadname);
        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println("thread" + threadname);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(threadname+"exception");
        }

    }
}
