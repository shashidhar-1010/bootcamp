public class Account {
    double amount = 1000;
    synchronized void withdraw(double amount) throws InterruptedException {
        System.out.println("withdrawing......");
        if(this.amount<amount){
            System.out.println("waiting for deposit");
            wait();
        }
        this.amount -= amount;
        System.out.println("withdraw done");
    }
    synchronized void deposit(double amount){
        System.out.println("depositing");
        this.amount += amount;
        System.out.println("deposit done");
        notify();
    }
}
