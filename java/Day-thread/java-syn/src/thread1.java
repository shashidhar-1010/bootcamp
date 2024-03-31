public class thread1 {

    table t;
    thread1(table t){
        this.t = t;
    }

    public void run(){
        t.printTable(5);
    }

    public void start() {
    }
}
