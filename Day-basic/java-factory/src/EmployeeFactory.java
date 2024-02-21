class EmployeeFactory {
    public static Employee createPEmployee(String empName,double bSalary,int hours){
        return new pEmployee(empName,bSalary,hours);
    }
    public static Employee createtEmployee(String empName,int hours){
        return new tEmployee(empName,hours);
    }
}
