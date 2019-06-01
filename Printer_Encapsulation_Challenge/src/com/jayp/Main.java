package com.jayp;

public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer(0,0, true);

        int status = myPrinter.reFillToner(100);
        if (status!=-1) {
            myPrinter.printPages(9, true);
        }
        else
            System.out.println("Wrong toner level set: Needs to be >0 and <=100");
    }
}
