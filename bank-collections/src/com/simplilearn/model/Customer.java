package com.simplilearn.model;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String firstName;

    private String lastName;

    //    private Account[] accounts;
    private Map<String, Account> accounts = new HashMap<>();
    int numberOfAccounts;

    public Customer(String f, String l){
        firstName = f;
        lastName = l;
        //accounts = new Account[10];
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

    public void addAccount(String accountId, Account account){
        accounts.put(accountId, account);
    }

    public Account getAccount(String accountID){
        return accounts.get(accountID);
    }
}
