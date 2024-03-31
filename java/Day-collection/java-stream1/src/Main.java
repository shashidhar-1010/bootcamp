import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<employee> emp = new ArrayList<>();
        emp.add(new employee(1,"abc",1000));
        emp.add(new employee(2,"def",2000));
        emp.add(new employee(3,"ghi",3000));
        emp.add(new employee(4,"jkl",4000));
        emp.add(new employee(5,"mno",5000));


        //using streams to find the max salary

        employee maxsalary = emp.stream().max(Comparator.comparing(employee::getSalary)).orElse(null);

        if(maxsalary != null){
            System.out.println("employee wit max salary:");
            System.out.println(maxsalary);
        }else{
            System.out.println("no employee found");
        }

        //using streams to find the second max salary

        employee secondmax = emp.stream().filter(x -> !x.equals(maxsalary))
                .max(Comparator.comparing(employee::getSalary)).orElse(null);

        if(secondmax != null){
            System.out.println("employee with second amx salary:");
            System.out.println(secondmax);
        }else{
            System.out.println("no employee found");
        }


    }
}