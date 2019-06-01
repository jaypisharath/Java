package com.jayp;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Please enter the number of integers:\r");
        count = input.nextInt();
        int[] intArray = readIntegers(count);
        int minNum = findMin(intArray);
        System.out.println("minNum = " + minNum);
    }

    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        System.out.println("Please enter "+ count + " integers:\r");
        for (int i=0; i< count; i++){
            intArray[i] = input.nextInt();
        }
        return intArray;
    }

    public static int findMin(int[] intArray) {
        boolean flag = true;
        int minNum = intArray[1];
        //minNum = Integer.MAX_VALUE;

       // while(flag) {
         //   flag = false;
            for (int i=0; i<intArray.length; i++) {
                if (minNum > intArray[i]) {
                    minNum = intArray[i];
                    flag = true;
                }
            }
        //}
        return minNum;
    }
}
