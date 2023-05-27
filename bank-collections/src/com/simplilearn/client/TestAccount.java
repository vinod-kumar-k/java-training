package com.simplilearn.client;

import com.simplilearn.errors.InsufficientBalanceException;
import com.simplilearn.model.*;

public class TestAccount {
    public static void main(String[] args) {

        try {
            //Bank training_banks = new Bank();
            Customer customer;
            Account account;

            Bank.addCustomers("One", "User");
            Bank.addCustomers("Two", "User");

            customer = Bank.getCustomer(0);
            customer.addAccount("Acc1", new CheckingAccount(100, 1000));
            System.out.println("Balance for Customer One: " + customer.getAccount("Acc1").getBalance());
            boolean withdrawStatus = customer.getAccount("Acc1").withDraw(1000);
            if (withdrawStatus) {
                System.out.println("Customer One withdrawn successfully");
            } else {
                System.out.println("Customer One's withdrawal was unsuccessful");
            }
            System.out.println("One's balance after withdrawal: " + customer.getAccount("Acc1").getBalance());

            System.out.println("Add bank account for customer Two");
            customer = Bank.getCustomer(1);
            customer.addAccount("Acc2", new SavingsAccount(1000, 0.14));
            System.out.println("Balance for Two: " + customer.getAccount("Acc2").getBalance());
            System.out.println("Withdraw 1000");
            withdrawStatus = customer.getAccount("Acc2").withDraw(1000);

            if (withdrawStatus) {
                System.out.println("Customer Two withdrawn successfully");
            } else {
                System.out.println("Customer Two's withdrawal was unsuccessful");
            }

            System.out.println("Deposit 10000");
            customer.getAccount("Acc2").deposit(10000);
            System.out.println("Balance for Two: " + customer.getAccount("Acc2").getBalance());
            System.out.println("Withdraw 1000");
            withdrawStatus = customer.getAccount("Acc2").withDraw(1000);

            if (withdrawStatus) {
                System.out.println("Customer Two withdrawn successfully");
            } else {
                System.out.println("Customer Two's withdrawal was unsuccessful");
            }
        }catch (InsufficientBalanceException e){
            e.printStackTrace();
        }
    }
}
