package com.jayp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int num[]= new int[] {5, 29, 3, 89,56, 23, 14, 90, 67, 87};
        System.out.println("Unsorted Array = " + Arrays.toString(num));
        num = bubbleSort(num);
        System.out.println("Sorted Array = " + Arrays.toString(num));

    }

    public static int[] bubbleSort(int[] num) {
        int temp, i, j;
        boolean flag = true;

        j=0;
        while (flag) {
            flag = false;
            System.out.println("Iteration # = " + j++);

            for (i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return num;
    }
}
