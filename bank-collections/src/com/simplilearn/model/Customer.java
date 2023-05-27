package com.simplilearn.model;

public class Customer {
    private String firstName;

    private String lastName;

    private Account[] accounts;

    int numberOfAccounts;

    public Customer(String f, String l){
        firstName = f;
        lastName = l;
        accounts = new Account[10];
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /*public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }*/

    public void addAccount(Account account){
        int i = numberOfAccounts++;
        accounts[i] = account;
    }

    public Account getAccount(int index){
        return accounts[index];
    }
}
