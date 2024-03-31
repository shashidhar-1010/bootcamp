import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isOdd = num -> num % 2 == 0;

        int num1 = 10;
        int num2 = 7;

        System.out.println((num1 + "is even " + isEven.test(num1)));
        System.out.println((num2 + "is even " + isEven.test(num2)));
    }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


}