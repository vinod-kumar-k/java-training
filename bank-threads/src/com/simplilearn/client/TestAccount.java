package com.simplilearn.client;

import com.simplilearn.errors.InsufficientBalanceException;
import com.simplilearn.model.*;
import com.simplilearn.tasks.TransactionTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestAccount {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {

            Bank.addCustomers("One", "User");

            Customer customer1 = Bank.getCustomer(0);
            customer1.addAccount("Acc1", new CheckingAccount(100, 1000));
            System.out.println("Balance for Customer One: " + customer1.getAccount("Acc1").getBalance());
            boolean withdrawStatus = customer1.getAccount("Acc1").withDraw(1000);
            if (withdrawStatus) {
                System.out.println("Customer One withdrawn successfully");
            } else {
                System.out.println("Customer One's withdrawal was unsuccessful");
            }
            System.out.println("One's balance after withdrawal: " + customer1.getAccount("Acc1").getBalance());


            /*Bank.addCustomers("Two", "User");
            Customer customer2 = Bank.getCustomer(1);
            customer2.addAccount("Acc2", new CheckingAccount(100, 1000));
            System.out.println("Balance for Customer Two: " + customer2.getAccount("Acc2").getBalance());*/

            Runnable task1 = new TransactionTask(customer1.getAccount("Acc1"));
            //Runnable task2 = new TransactionTask(customer2.getAccount("Acc2"));

            executorService.submit(task1);
            //executorService.submit(task2);

        }catch (InsufficientBalanceException e){
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }
}
