package com.jayp;

public class Printer {
    private int tonerLevel = 0;
    private int pagesPrinted = 0;
    private boolean duplexPrint = true;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrint) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplexPrint = duplexPrint;
    }

    public int reFillToner(int tonerLevel) {
        if (tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
            System.out.println("Toner is now filled to level " + tonerLevel);
            return 0;
        }
        else {
            System.out.println("Toner level is not valid");
            return -1;
        }
    }

    public void printPages (int numPages, boolean duplexPrint) {
        if (duplexPrint) {
            System.out.println("Printing " +numPages +" pages in duplex mode...");
            if(numPages%2 !=0) numPages++;
            for (pagesPrinted=1; pagesPrinted<=numPages/2; pagesPrinted++ ) {
                System.out.println("Printing 2 sides on page #" + pagesPrinted);
                tonerLevel--;
            }
            System.out.println("Done with printing... toner level = " +tonerLevel);
        }
        else {
            for (pagesPrinted=1; pagesPrinted<=numPages; pagesPrinted++ ) {
                System.out.println("Printing 1 side on page #" + pagesPrinted);
                tonerLevel--;
            }
            System.out.println("Done with printing... toner level = " +tonerLevel);
        }

    }
}
