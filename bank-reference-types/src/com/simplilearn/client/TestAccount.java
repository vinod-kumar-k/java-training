package com.simplilearn.client;

import com.simplilearn.model.Account;
import com.simplilearn.model.Customer;

public class TestAccount {
    public static void main(String[] args) {

        System.out.println("Create the customer Abcd Xyz");
        Customer customer = new Customer("Abcd", "Xyz");

        System.out.println("Create Account");
        Account account = new Account(5000);
        customer.setAccount(account);

        System.out.println("Balance before deposit: " + customer.getAccount().getBalance());
        customer.getAccount().deposit(10000);
        System.out.println("Balance after deposit: " + customer.getAccount().getBalance());
        customer.getAccount().withDraw(2500);
        System.out.println("Balance after withdrawal: " + customer.getAccount().getBalance());

    }
}
