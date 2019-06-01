package com.jayp;

public class DeluxeBurger extends BasicBurger {
    public DeluxeBurger(String breadRoll, String meat, String topping1, String topping2) {
        super(breadRoll, meat, topping1, topping2, "Not allowed", "Not allowed");
    }

    public double getPrice() {
        System.out.println("topping3 = " + getTopping3());
        System.out.println("This is a set menu - soda is 1.80 and Chips is 3.20");
        price = price -10;
        return price;
    }
}
