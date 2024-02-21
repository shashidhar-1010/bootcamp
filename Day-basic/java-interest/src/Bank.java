abstract class Bank {
    protected String bankName;
    protected double Amount;
    protected int years;

    public Bank(String bankName,double Amount,int years){
        this.bankName = bankName;
        this.Amount = Amount;
        this.years = years;
    }

    public abstract double maturityAmount();
}
