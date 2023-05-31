package com.simplilearn.model;

import java.util.Objects;

public class Transactions {
    private String transactionID;

    private String type;

    private double amount;

    public Transactions(String transactionID, String type, double amount) {
        this.transactionID = transactionID;
        this.type = type;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(transactionID, that.transactionID) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, type, amount);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
