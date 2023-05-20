package com.simplilearn.client;

import com.simplilearn.model.Account;

public class TestAccount {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        Account account = new Account(5000.00);

        System.out.println("Balance Before deposit: " +  account.getBalance());

        account.deposit(10000.00);

        System.out.println("Balance After deposit: " +  account.getBalance());

        account.withDraw(5000);

        System.out.println("Balance After withdrawal: " +  account.getBalance());

    }
}
