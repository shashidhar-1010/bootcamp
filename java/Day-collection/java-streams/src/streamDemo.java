import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.Integer;

public class streamDemo {
    public static void main(String... args){
        List<Integer> numberList =  Arrays.asList(12,34,56,78,2,3,4,5,6);
        numberList.stream().filter( n -> n%2 == 0).map(x->x*x).sorted()
                .forEach(t ->System.out.println(t));

        /*numberList.stream().filter( n -> n%2 == 0).map(x->x*x).sorted()
                .forEach(t ->System.out::println);*/
        //to store into another list
        List<Integer> newList = numberList.stream().filter( n -> n%2 == 0).map(x->x*x).sorted()
                .collect(Collectors.toList());

        System.out.println(newList);

        numberList.stream().max(Integer::compareTo).get();
    }

}

//filter the even numbers
//sq the numbers
//sort the numbers
//display the numbers
