package com.jayp;

import java.util.ArrayList;

public class Branches {
    String branchName;
    ArrayList<Customers> branchCustomers = new ArrayList<Customers>();

    public Branches(String branchName, ArrayList<Customers> branchCustomers) {
        this.branchName = branchName;
        for (int i=0; i<branchCustomers.size(); i++) {
            //System.out.println("Customer Added:" + (branchCustomers.get(i)).getCustName());
            addCustomer(branchCustomers.get(i));
        }
    }

    public void addCustomer(Customers customer) {
        boolean flag;
        //System.out.println("customer.getCustName() = " + customer.getCustName());
        flag = doCustomerExist(customer.getCustName());
        //System.out.println("flag = " + flag);
        if (!flag)
            this.branchCustomers.add(customer);
        else
            System.out.println("Customer "+ customer.getCustName() + " is already registered in this branch!");
    }

    private boolean doCustomerExist(String customerName) {
        for (int i=0; i<branchCustomers.size(); i++) {
            System.out.println("branchCustomers = " + branchCustomers.get(i).getCustName());
            if(customerName.equals(branchCustomers.get(i).getCustName())) {
                return true;
            }
        }
        return false;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getBranchCustomers() {
        return branchCustomers;
    }


}
