public class table {
    void printTable(int n){
        synchronized (this) {
            System.out.println("table of:" + n);
            for (int i = 0; i <= 10; i++) {
                System.out.println(n * i);
            }
        }
    }
}
