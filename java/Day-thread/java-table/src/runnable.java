public class runnable implements Runnable{
    private int number;

    public runnable(int number){
        this.number = number;
    }

    public void run(){

        System.out.println("table"+ number +"table");
        for(int i=0;i<=10;i++){
            System.out.println(number + "*" +i+"="+number*i);
        }
    }
}
