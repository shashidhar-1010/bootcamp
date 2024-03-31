@FunctionalInterface
public interface MyFunctionalInterface {
    int getSum(int a,int b);
    // an interface can have only one abstract method
    //we can have any number of default methods in interface
    default void log(String str){
        System.out.println("logging......." +str);
    }
}
