package com.training1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Account emp1 = new Account(123,1000,25);
        emp1.setAccountNo(1334);
        emp1.setBalance(10);
        System.out.println(emp1);
        System.out.println(emp1.deposit(123));
        System.out.println(emp1.withdraw(130));

        Account[] accounts = new Account[5];
        accounts[0] = new Account(1,10.0,25);
        accounts[1] = new Account(2,10.0,26);
        accounts[2] = new Account(3,10.0,27);
        accounts[3] = new Account(4,10.0,28);
        accounts[4] = new Account(5,10.0,29);

        int sum = 0;
        for (Account acc : accounts){
            sum +=acc.getAge();
        }

        double aveage = sum / (double) accounts.length;
        System.out.println("avgage:"+ aveage);




    }
}