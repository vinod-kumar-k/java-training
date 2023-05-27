package com.simplilearn.model;

import com.simplilearn.errors.InsufficientBalanceException;

public abstract class Account implements AccountOperations {

    protected double balance;
    protected Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withDraw(double amount) throws InsufficientBalanceException;

    public abstract void deposit(double amount);
}
