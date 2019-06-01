package com.jayp;

public class Main {

    public static void main(String[] args) {
        int number = 1;

        for (int count=1; count <=10; number++) {
            if(isPrimeNumber (number)) {
                System.out.println("Prime number #"+ count + " = " + number);
                count ++;
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
      //  for (int i=2; i<=number/2; i++){ Could simply go till the number is a multiplier of 2
        for (int i=2; i<= Math.sqrt(number); i++){ // quicker way is to use squareroot
            if ((number%i)==0) {
             return false;
         }
        }
        return true;
    }
}
