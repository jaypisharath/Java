package com.jayp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int num[]= new int[] {5, 29, 3, 89,56, 23, 14, 90, 67, 87};
        int searchKey = 23;
        int left = 0, right = 10;
        int finalPos=-1;

        System.out.println("Array is = " + Arrays.toString(num));
        num=sortArray(num, left, right);
        System.out.println("Sorted array is = " + Arrays.toString(num));

    }

    // Main sort function
    public static int[] sortArray(int[] num, int left, int right) {

            int mid = (left+right)/2;
            int temp;

        System.out.println("left = " + left + ": right =" +right + ": mid =" +mid);

            if (right == left+1) {
                if (left>right) {
                    temp = num[left];
                    num[left] = num[right];
                    num[right] = temp;
                }
                return num;
            }

                //recursive sorting
                if (left < right) num = sortArray(num, left, mid-1);
                else num = sortArray(num, mid + 1, right);

                // ensure you merge after you sort the particular block (recursive function) you are in
                num = mergeArray(num, left, mid, right);
            //}
        return num;
    }

    public static int[] mergeArray(int[] num, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right - mid;

        //create temp arrarys
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy arrays to respective locations - Left or Right
        int i=0, j=0;
        for (i=0; i< n1; i++)
            L[i] = num[left+i];

        for (i=mid; i<n2; i++)
            R[i] = num[i];

        i=0; j=0;
        int k=left;
        System.out.println("i = " + i + " k =" +k) ;

        while((i< n1) && (j< n2)) {
            if(L[i] <= R[j]) {
                num[k] = L[i];
                i++;
            }
            else {
                num[k]= R[j];
                j++;
            }
            k++;
        }

        System.out.println("Iteration 2 i = " + i + " k =" +k) ;
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            num[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            num[k] = R[j];
            j++;
            k++;
        }
        System.out.println("Sorted array is = " + Arrays.toString(num));

        return num;

    }
}
