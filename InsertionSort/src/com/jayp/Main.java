package com.jayp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int num[]= new int[] {5, 29, 3, 89,56, 23, 14, 90, 67, 87};
        System.out.println("Unsorted Array = " + Arrays.toString(num));
        num = insertionSort(num);
        System.out.println("Sorted Array = " + Arrays.toString(num));
    }

    /* ---------
    // Insertion sort is similar to playing cards. Take one card out and insert it in the sorted slot.
    ------------*/
    public static int[] insertionSort(int[] num) {
        int i=0, key=0, j=0;
        int pointer = 0;

        for (i=1; i<num.length; i++) {
            key = num[i]; j=i-1;
            while (j>=0 && key < num[j]) {
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
        return num;
    }
}
