package com.simplilearn.client;

import com.simplilearn.model.Account;
import com.simplilearn.model.Bank;
import com.simplilearn.model.CheckingAccount;
import com.simplilearn.model.Customer;

public class TestAccount {
    public static void main(String[] args) {

        Bank training_banks = new Bank();
        Customer customer;
        Account account;

        training_banks.addCustomers("One", "User");
        training_banks.addCustomers("Two", "User");

        customer = training_banks.getCustomer(0);
        customer.addAccount(new CheckingAccount(100, 1000));
        System.out.println("Balance for Customer One: " + customer.getAccount(0).getBalance());
        boolean withdrawStatus = customer.getAccount(0).withDraw(1000);
        if(withdrawStatus){
            System.out.println("Customer One withdrawn successfully");
        }else{
            System.out.println("Customer One's withdrawal was unsuccessful");
        }
        System.out.println("One's balance after withdrawal: " + customer.getAccount(0).getBalance());

        System.out.println("Add bank account for customer Two");
        customer = training_banks.getCustomer(1);
        customer.addAccount(new CheckingAccount(100));
        System.out.println("Balance for Two: " + customer.getAccount(0).getBalance());
        System.out.println("Withdraw 1000");
        withdrawStatus = customer.getAccount(0).withDraw(1000);

        if(withdrawStatus){
            System.out.println("Customer Two withdrawn successfully");
        }else{
            System.out.println("Customer Two's withdrawal was unsuccessful");
        }

        System.out.println("Deposit 10000");
        customer.getAccount(0).deposit(10000);
        System.out.println("Balance for Two: " + customer.getAccount(0).getBalance());
        System.out.println("Withdraw 1000");
        withdrawStatus = customer.getAccount(0).withDraw(1000);

        if(withdrawStatus){
            System.out.println("Customer Two withdrawn successfully");
        }else{
            System.out.println("Customer Two's withdrawal was unsuccessful");
        }
    }
}
