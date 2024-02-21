//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Employee emp1 = new Employee("abc",1234);
            System.out.println("employee" +"  "+emp1.name+ "salary" +emp1.salary);

            Employee emp2 = new Employee("efg",12378);
            System.out.println("employee" +"  "+emp2.name+ "salary" +emp1.salary);
        }
        catch (salaryValidation e){
            System.out.println("error");
        }
    }


}