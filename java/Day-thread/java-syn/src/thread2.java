public class thread2 {

    table t;
    thread2(table t){
        this.t = t;
    }

    public void run(){
        t.printTable(10);
    }

    public void start() {
    }
}
