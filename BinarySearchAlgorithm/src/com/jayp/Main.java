package com.jayp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int num[]= new int[] {5, 29, 3, 89,56, 23, 14, 90, 67, 87};
        int searchKey = 23;
        int left = 0, right = 10;
        int finalPos=-1;

        System.out.println("Array is = " + Arrays.toString(num));
        num = sortArray(num);
        System.out.println("Sorted array is = " + Arrays.toString(num));

        finalPos = searchR(num,  searchKey, left, right);
        if (finalPos !=-1) {
            System.out.println("finalPos = " + (finalPos+1));
        }
        else System.out.println("Error in look up");

    }

    // BINARY SEARCH IN A RECURSIVE WAY
    public static int searchR (int[] num, int searchKey, int left, int right ) {
        int foundPos=-1;
        foundPos = helperFunction(num,searchKey, left, right);
        return foundPos;

    }

    public static int helperFunction(int[] num, int searchKey, int left, int right) {
        int mid = (left+right)/2;
        int i=0;

        if (left>right) return -1; //Array must be sorted prior to this function

        System.out.println("searchKey = " + searchKey +"; left = " +left + " right = " +right +" mid = " +mid);

        if (searchKey == num[mid]) return mid;
        else
            if (searchKey < num[mid])
                return helperFunction(num, searchKey, left, mid-1);
            else
                return helperFunction(num, searchKey, mid, right);


    }

    // Sort the array
    public static int[] sortArray(int[] values) {
        boolean flag = true;

        while (flag) {
            flag = false;
            int temp, count;
            count = 0;
            for(int i=0; i<values.length-1; i++) {
                if(values[i]>values[i+1]) {
                    temp = values[i+1];
                    values[i+1] = values[i];
                    values[i] = temp;
                    flag = true;
                }
            }
        }
        return values;
    }

}
