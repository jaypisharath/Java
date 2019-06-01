package com.jayp;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(int position) {
        System.out.println("Removing grocery item in position " + position + ".\n");
        groceryList.remove(position);
    }

    public void modifyItem(int position, String item) {
        System.out.println("About to replace "+ groceryList.get(position) +"with" + item);
        groceryList.set(position, item);
    }

    public void printGroceryList() {
        int i;
        System.out.println("Grocery list has following items:");
        for (i=0; i<groceryList.size(); i++)
            System.out.println(i + 1 + ". " + groceryList.get(i));
        if (i==0) System.out.println("No items in grocery list...");
    }

    public String findItem (String searchItem) {
        boolean exists = groceryList.contains(searchItem); //contains will search and confirm the entry
        int position = groceryList.indexOf(searchItem); //will search and return index of entry
        if (position >=0) {
            System.out.println("Item" +searchItem +" found in position " +position +"!");
            return groceryList.get(position);
        }
        else {
            System.out.println("Item" +searchItem +" not found in grocery list " );
            return null;
        }
    }


}
