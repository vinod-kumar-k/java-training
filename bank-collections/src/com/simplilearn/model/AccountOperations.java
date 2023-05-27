package com.simplilearn.model;

import com.simplilearn.errors.InsufficientBalanceException;

public interface AccountOperations {
    public boolean withDraw(double amount) throws InsufficientBalanceException;

    public void deposit(double amount);

    public double getBalance();
}
