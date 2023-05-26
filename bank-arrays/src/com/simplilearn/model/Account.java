package com.simplilearn.model;

public class Account {

    private double balance;
    public Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withDraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
}
