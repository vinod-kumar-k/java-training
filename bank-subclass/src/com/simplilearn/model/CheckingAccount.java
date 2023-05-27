package com.simplilearn.model;

public class CheckingAccount extends Account{
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance); //Invoke super class constructor
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0.0);
    }

    @Override
    public boolean withDraw(double amount) {
        boolean result = true;
        if(balance < amount){
            double overDraftNeeded = amount - balance;

            if(overdraftAmount < overDraftNeeded){
                result = false;
            }else{
                overdraftAmount -= overDraftNeeded;
                balance = 0.0;
            }
        }else {
            balance -= amount;
        }

        return result;
    }
}
