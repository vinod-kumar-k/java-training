package com.simplilearn.model;

public abstract class Account implements AccountOperations {

    protected double balance;
    protected Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withDraw(double amount);

    public abstract void deposit(double amount);
}
