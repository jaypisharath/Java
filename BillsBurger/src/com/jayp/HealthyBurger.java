package com.jayp;

public class HealthyBurger extends BasicBurger {
    String topping5;
    String topping6;

    public HealthyBurger(String meat, String topping1, String topping2, String topping3, String topping4, String topping5, String topping6) {
        super("Brown Rye Bread", meat, topping1, topping2, topping3, topping4);
        this.topping5 = topping5;
        this.topping6 = topping6;
    }

    public double getPrice() {
        System.out.println("topping5 = " + topping5);
        if (this.topping5 != null) price = price+10;
        if (this.topping6 != null) price = price+10;
        return price;
    }
}

