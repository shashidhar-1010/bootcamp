class tEmployee implements Employee{
    private String empName;

    private int hours;

    public tEmployee(String empName,int hours){
        this.empName = empName;

        this.hours = hours;
    }

    @Override
    public double getSalary() {
        return  50*hours;
    }

    @Override
    public String getEmployeeInfo() {
        return null;
    }

    @Override
    public String getEmpName(){
        return "tEmployee:" + empName;
    }
}
