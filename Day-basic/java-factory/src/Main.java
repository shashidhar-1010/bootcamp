//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee perEmp = EmployeeFactory.createPEmployee("abcd",5000,30);
        Employee temEmp = EmployeeFactory.createtEmployee("xfgt",45);

        System.out.println(perEmp.getEmployeeInfo());
        System.out.println("salary :"+ perEmp.getSalary());

        System.out.println(temEmp.getEmployeeInfo());
        System.out.println("salary :"+ temEmp.getSalary());


    }


}