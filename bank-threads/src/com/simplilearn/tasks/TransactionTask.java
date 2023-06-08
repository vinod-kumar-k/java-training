package com.simplilearn.tasks;

import com.simplilearn.errors.InsufficientBalanceException;
import com.simplilearn.model.Account;

import java.util.Scanner;

public class TransactionTask implements Runnable {
    private Account account;
    private Scanner scanner;

    public TransactionTask(Account account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }


    @Override
    public void run() {
        try {
            System.out.println("Initial Balance: " + account.getBalance());
            System.out.println("Enter Deposit Amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("After Deposit: " + account.getBalance());
            System.out.println("Enter Withdrawal Amount: ");
            amount = scanner.nextDouble();
            account.withDraw(amount);
            System.out.println("After Withdrawal: " + account.getBalance());
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
