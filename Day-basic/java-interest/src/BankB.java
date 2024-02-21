class BankB extends Bank{
    private double rate = 0.09;
    public BankB(double Amount , int years ){
        super("BankB",Amount,years);
    }
    @Override
    public double maturityAmount(){
        return Amount*Math.pow((1+ rate),years);
    }

}