import java.util.*;

public class Main {
    public static  void main(String... args) {
        //Set names = new HashSet(); //without generics
        //Set<String> names = new HashSet<>();//with generics<>//there will be no order
        //Set<int> numbers = new HashSet<>();// for primitive we use wrapper class
        //Set<Integer> numbers = new HashSet<>();
        Set<String> names = new TreeSet<>();// treeset gives in order
        Set<student>  studSet = new TreeSet<>(new nameCom());
        //Set<student>  studSet = new HashSet<>();//if u replace hash with tree set u will get error u need comarable in student class

        studSet.add(new student(101,"shashi",21,'A'));
        studSet.add(new student(102,"adukheif",21,'B'));
        studSet.add(new student(103,"bdn",21,'A'));
        studSet.add(new student(101,"shashi",21,'A'));

        for(student stud:studSet){
            System.out.println(stud.getStuId()+" : "+ stud.getStuName());
        }

        List<student> studList = new ArrayList<>();
        studList.add(new student(102,"apple",21,'A'));
        studList.add(new student(102,"apple",22,'A'));
        studList.add(new student(103,"ap",23,'A'));
        studList.add(new student(104,"app",24,'A'));


        System.out.println(".........................");
        Collections.sort(studList, new nameCom());
        for(student stud: studList){
            System.out.println(stud);
        }


        Arrays Array;
        List<Integer> numberList = Arrays.asList(2,4,56,78);
        for(int i:numberList){
            System.out.println(i);
        }



        //names.add("shashi");
        //names.add("reddy");
        //names.add("apple");
        //names.add(23);

        //enhanced for loop

        /*for(String name:names){
            System.out.println(name);
        }*/

        //Iterator it = names.iterator();//with out generics
        //Iterator<String> it = names.iterator();
        //while(it.hasNext()){
            //System.out.println(it.next());
        //}

    }
}