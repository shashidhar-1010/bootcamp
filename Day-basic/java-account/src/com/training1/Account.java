package com.training1;

public class Account {


    private double accountNo;
    private double balance;

    private int age;




    public Account(double  accountNo, double balance,int age){
        this.accountNo=accountNo;
        this.balance=balance;
        this.age = age;
    }

    public double getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(double accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    ;

    public double deposit( double amount){
        if(amount > 0){
            balance += amount;

        }
        else{
            System.out.println("invalid amount");

        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;

            System.out.println("amount withdrawn" + amount);
        } else {
            System.out.println("insufficient funds");
        }
        return balance;
    }
    public double  getBalance(){
        return balance;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", balance=" + balance +
                ", age=" + age +
                '}';
    }
}

