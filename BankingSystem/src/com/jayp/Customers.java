package com.jayp;

import java.util.ArrayList;

public class Customers {
    String custName;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customers(String custName, ArrayList<Double> transactions) {
        this.custName = custName;
        this.transactions = transactions;
    }

    public void addCustName(String custName) {
        this.custName = custName;
    }

    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
    }

    public String getCustName() {
        return custName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
