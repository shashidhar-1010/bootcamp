import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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


        Map<String,Integer>  empMap = new HashMap<>();
        empMap.put("abc",1000);
        empMap.put("def",2000);
        empMap.put("ghi",3000);
        empMap.put("jkl",4000);

        Map.Entry<String,Integer> finalResult = empMap.entrySet().stream().
                sorted(Comparator.comparing(entry ->entry.getValue()))
                .collect(Collectors.toList()).get(empMap.size()-1);
        System.out.println(finalResult);

        Optional<Integer> maxSalary = empMap.values().stream().max(Integer::compareTo);
        if(maxSalary.isPresent()){
            System.out.println("highest salary "+ maxSalary.get());
        }else{
            System.out.println("no salaries found");
        }





        //removing give only key
        //mymap.remove(1);
        //System.out.println(mymap);

        for(Map.Entry<Integer,String> entry:mymap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
        }
    }
}

