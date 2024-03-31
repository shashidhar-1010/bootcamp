package org.example;

public class CalculatorService {
    private static AddService addService;

    public CalculatorService(AddService addService) {
        this.addService = addService;
    }



    public static int calculate(int n1, int n2){
        System.out.println("calculate service executed::::");
        return addService.add(n1,n2);
    }
}
