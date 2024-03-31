//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        table tab = new table();
        thread1 t1 = new thread1(tab);
        thread2 t2 = new thread2(tab);
        t1.start();
        t2.start();

    }
}