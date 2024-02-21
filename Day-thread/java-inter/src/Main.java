//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account();
        new Thread() {
            public void run() {

                try {
                    acc.withdraw(1200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                acc.deposit(1200);

            }



        }
    }

}
