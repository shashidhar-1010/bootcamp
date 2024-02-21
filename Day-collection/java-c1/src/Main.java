import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        //Set names = new HashSet(); without generics
        //Set<String> names = new HashSet<>();//with generics<>//there will be no order
        //Set<int> numbers = new HashSet<>();// for primitive we use wrapper class
        Set<Integer> numbers = new HashSet<>();
        Set<String> names = new TreeSet<>();// treeset gives in order
        names.add("shashi");
        names.add("reddy");
        names.add("apple");
        //names.add(23);

        //enhanced for loop

        for(String name:names){
            System.out.println(name);
        }

        //Iterator it = names.iterator();//with out generics
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

/// boxing :conversion of primitive to object
/// unboxing:conversion of object to primitive
///autoboxing :automatic conversion