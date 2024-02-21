class BankA extends Bank{
    private double rate = 0.08;
    public BankA(double Amount , int years ){
        super("BankA",Amount,years);
    }
    @Override
    public double maturityAmount(){
        return Amount*Math.pow((1+ rate),years);
    }

}
