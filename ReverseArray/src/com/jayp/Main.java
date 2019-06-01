package com.jayp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int count;
        System.out.println("Enter # of entries in array:\r");
        count = input.nextInt();
        int [] intArray = new int[count];
        int [] reversedArray = new int[count];

        System.out.println("Enter array of integers:\r");
        for (int i=0; i<count; i++) {
            intArray[i] = input.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(intArray));

        reversedArray = reverseArray(intArray);
        System.out.println("Original Array: " + Arrays.toString(reversedArray));



    }

//    public static int[] reverseArray(int[] intArray) {
//        int [] reversedArray = new int[intArray.length];
//        int j=0;
//        //System.out.println("length = " + intArray.length);
//
//        for (int i =intArray.length-1; i>=0; i--) {
//            reversedArray[j] = intArray[i];
//            //System.out.println("i = " + i + "j =" +j +"reverseArray =" +reversedArray[j] + "intArray ="+ +intArray[i]);
//            j++;
//        }
//        return reversedArray;
//    }

    //Challenge without creating a new array - direct swap
    public static int[] reverseArray(int[] intArray) {
        //int [] reversedArray = new int[intArray.length];
        int length = intArray.length-1;
        int travelLenth = length/2;
        int temp;
        //System.out.println("length = " + intArray.length);

        for (int i =0; i<travelLenth; i++) {
            temp = intArray[length-i];
            intArray[length-i] = intArray[i];
            intArray[i] = temp;
            //System.out.println("i = " + i + "j =" +j +"reverseArray =" +reversedArray[j] + "intArray ="+ +intArray[i]);
        }
        return intArray;
    }
}
