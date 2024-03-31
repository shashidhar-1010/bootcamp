import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String...args){
        Map<Integer ,String> mymap = new HashMap<>(10,0.75f);
        mymap.put(1,"abc");
        mymap.put(2,"bsgd");
        mymap.put(3,"sgdge");
        mymap.put(4,"hdge");
        mymap.put(5,"bjhsdgjwe");

        //updating map
        mymap.put(2,"shashi");
        System.out.println(mymap);

        //removing give only key
        mymap.remove(1);
        System.out.println(mymap);
    }
}
