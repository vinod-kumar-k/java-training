package com.simplilearn.model;

public interface AccountOperations {
    public boolean withDraw(double amount);

    public void deposit(double amount);

    public double getBalance();
}
