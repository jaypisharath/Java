package com.jayp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //First Customer
        ArrayList<Double> cust1Transactions = new ArrayList<Double>();
        cust1Transactions.add(1000.00);
        cust1Transactions.add(50.02);
        Customers cust1 = new Customers("Jay", cust1Transactions);

        //Add Customer to Bank and Branch
        ArrayList<Customers> branch1Customers = new ArrayList<Customers>();
        branch1Customers.add(cust1);
        branch1Customers.add(cust1);

        Branches branch1 = new Branches("San Francisco", branch1Customers);
        ArrayList <Branches> branchListBank1 = new ArrayList<Branches>();
        branchListBank1.add(branch1);
        branchListBank1.add(branch1);

        Bank bank1 = new Bank("Bank A", branchListBank1);

        System.out.println("Bank 1 =" + bank1.bankName);
        System.out.println("Bank 1 Branches = " + branch1.getBranchName());
        System.out.println("Customer in Branch = " + cust1.getCustName());

    }
}
