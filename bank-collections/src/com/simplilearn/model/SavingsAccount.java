package com.simplilearn.model;

import com.simplilearn.errors.InsufficientBalanceException;

public class SavingsAccount extends Account implements InterestEarning{
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate){
        super(initBalance);

        this.interestRate = interestRate;
    }

    @Override
    public boolean withDraw(double amount) throws InsufficientBalanceException {
        if(amount <= balance){
            balance = balance - amount;
            return true;
        }else {
            System.out.println("Insufficient balance");
            throw new InsufficientBalanceException("Insufficient balance");
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
