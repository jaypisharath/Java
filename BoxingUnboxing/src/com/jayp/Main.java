package com.jayp;

import java.text.DecimalFormat;
import java.util.ArrayList;


//Example of a Wrapper (BOXING) - Class that wraps and keeps things private
// Note: need to have a get and set method since number is private variable
class IntClass {
    private int number;

    public IntClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Item1");

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        IntClass intNum1 = new IntClass(20);
        intArrayList.add(intNum1);

        ArrayList<Integer> intArrayList2 = new ArrayList<Integer>();
        Integer intNum2 = new Integer(21);
        intArrayList2.add(intNum2);

        for (int i=0; i<=10; i++) {
            intArrayList2.add(Integer.valueOf(i)); //AUTOBOXING - converting something to a type
        }

        for (int i=0; i<=10; i++) {
            System.out.println("Value = " + intArrayList2.get(i).intValue());
        }

        intNum2 = 56; //Translates to intNum2 = Integer.valueof(56);
        System.out.println("Value = " + intNum2);
        //Also available are Double class, Float Class

        int temp = intNum2; //converts to intNum2.intValue();
        //Autoboxing is the conversion Java does

        ArrayList<Double> myDblList = new ArrayList<Double>();

        for (double dbl=0.00; dbl<=1.0; dbl=dbl+0.01) {
            myDblList.add(dbl);
        }

        DecimalFormat two = new DecimalFormat("#0.00");
        for (int i=0; i<myDblList.size(); i++) {
            System.out.println("Dbl value = " + two.format (myDblList.get(i)));
        }
    }
}


