public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary) throws salaryValidation{
        if(salary<0){
            throw new salaryValidation("salary cannot be negative");
        }
        if(salary<1000){
            throw new salaryValidation("salary cannot be less than 1000");
        }
        this.name= name;
        this.salary=salary;
    }
}
