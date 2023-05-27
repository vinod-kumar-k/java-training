package com.simplilearn.model;

public class SavingsAccount extends Account implements InterestEarning{
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate){
        super(initBalance);

        this.interestRate = interestRate;
    }

    @Override
    public boolean withDraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            return true;
        }else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    @Override
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void addInterest(){
        balance = balance + balance * interestRate;
    }
}
