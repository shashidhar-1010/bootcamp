public class LambdaDemo {

    public static void main(String ...args){
        //getSum(20,30);
        MyFunctionalInterface obj = (a,b)->a+b;
        System.out.println(obj.getSum(20,30));

    }
    /*private static int getSum(int a,int b){
        return a+b;
    }*/

}
