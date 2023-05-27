package com.simplilearn.model;

import java.util.Scanner;

public class Bank {
    private static Customer[] customers;

    private static int numberOfCustomers;

    static {
        customers = new Customer[10];

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting index: ");
        numberOfCustomers = scanner.nextInt();*/

        numberOfCustomers = 0;
    }

    private Bank() {
        //This constructor should never be called
    }

    public static void addCustomers(String f, String l) {
        int i = numberOfCustomers++;
        System.out.println("I: " + i);
        customers[i] = new Customer(f, l);
    }

    public static Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }

    public static int getNumberOfCustomers(){
        return numberOfCustomers;
    }
}
