package com.jayp;

import java.util.ArrayList;

public class Bank {

    String bankName;
    ArrayList<Branches> bankBranches = new ArrayList<Branches>();

    public Bank(String bankName, ArrayList<Branches> bankBranches) {
        this.bankName = bankName;
        for (int i=0; i<bankBranches.size(); i++) {
            //System.out.println("Customer Added:" + (branchCustomers.get(i)).getCustName());
            addBranch(bankBranches.get(i));
        }
    }

    public void addBranch(Branches branch) {
        boolean flag;
        //System.out.println("customer.getCustName() = " + customer.getCustName());
        flag = doBranchExist(branch.getBranchName());
        //System.out.println("flag = " + flag);
        if (!flag)
            this.bankBranches.add(branch);
        else
            System.out.println("Branch "+ branch.getBranchName() + " is already registered in this bank!");
    }

    private boolean doBranchExist(String branchName) {
        for (int i=0; i<bankBranches.size(); i++) {
            System.out.println("BranchName = " + bankBranches.get(i).getBranchName());
            if(branchName.equals(bankBranches.get(i).getBranchName())) {
                return true;
            }
        }
        return false;
    }


    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branches> getBankBranches() {
        return bankBranches;
    }
}
