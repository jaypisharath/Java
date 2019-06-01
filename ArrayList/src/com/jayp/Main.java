package com.jayp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        int entry;
        boolean flag = true;
        printInstructions();
        while (flag) {
            entry = input.nextInt();
            switch (entry) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Please make an entry:");
        System.out.println("\t Press 0 to exit this menu");
        System.out.println("\t Press 1 to print grocery list");
        System.out.println("\t Press 2 to add item to grocery list");
        System.out.println("\t Press 3 to remove item from grocery list");
        System.out.println("\t Press 4 to modify item in grocery list");
        System.out.println("\t Press 5 to search item in the grocery list");
        System.out.println("\t Press 6 to print instructions again");

    }

    public static void printList() {
        groceryList.printGroceryList();
    }

    public static void addItem() {
        String name;
        System.out.println("Please enter item to add:");
        name = input.next();
        System.out.println("Entered:" +name);

        groceryList.addItem(name);

    }

    public static void modifyItem() {
        int position;
        String name;
        System.out.println("Please enter position of item to modify:");
        position = input.nextInt();
        System.out.println("Please enter new item:");
        name = input.next();
        groceryList.modifyItem(position-1,name); //User will enter in human number format starting with 1
    }

    public static void removeItem() {
        System.out.println("Please enter item number to remove:");
        groceryList.removeItem(input.nextInt());
    }

    public static void searchItem() {
        String name;
        System.out.println("Please enter name of item to search:");
        name = input.next();
        groceryList.findItem(name);
    }
}
