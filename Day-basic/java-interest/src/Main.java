//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankA bankA = new BankA(5000,5);
        BankB bankB = new BankB(1000,5);


        System.out.println("Maturity amount :"+ bankA.maturityAmount());
        System.out.println("Maturity amount :"+ bankB.maturityAmount());


    }
}