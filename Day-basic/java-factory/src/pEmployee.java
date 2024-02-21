class pEmployee implements Employee{
    private String empName;
    private double bSalary;
    private int hours;

    public pEmployee(String empName,double bSalary,int hours){
        this.empName = empName;
        this.bSalary = bSalary;
        this.hours = hours;
    }

    @Override
    public double getSalary() {
        return bSalary + 40*hours;
    }

    @Override
    public String getEmployeeInfo() {
        return null;
    }

    @Override
    public String getEmpName(){
        return "pEmployee:" + empName;
    }
}