package com.simplilearn.model;

import com.simplilearn.errors.InsufficientBalanceException;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class Account implements AccountOperations {

    protected double balance;
    protected Set<Transactions> transactions = new HashSet<>();
    protected Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void addTransaction(String type, Double amount) {
        String transactionId = UUID.randomUUID().toString();
        transactions.add(new Transactions(transactionId, type, amount));
    }

//    public abstract boolean withDraw(double amount) throws InsufficientBalanceException;

//    public abstract void deposit(double amount);
}
