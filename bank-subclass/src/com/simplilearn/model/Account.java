package com.simplilearn.model;

public class Account {

    protected double balance;
    protected Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withDraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            return true;
        }else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
}
