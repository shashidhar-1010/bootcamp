public class sum implements Runnable{
    private int number;
    private int sum;

    public sum(int number) {
        this.number = number;
    }

    public int getSum(){
        return sum;
    }

    @Override
    public void run() {
        for(int i=1;i<=number;i++){
            sum += i;
        }

    }
}
