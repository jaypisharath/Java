package com.jayp;

public class BasicBurger {
    String breadRoll;
    String meat;
    String topping1, topping2, topping3, topping4;
    double price;

    public BasicBurger(String breadRoll, String meat, String topping1, String topping2, String topping3, String topping4) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;

        this.price = 10+10;
        if (this.topping1 != null) this.price = this.price+10;
        if (this.topping2!= null) this.price = this.price+10;
        if (this.topping3!=null) this.price = this.price+10;
        if (this.topping4!=null) this.price = this.price+10;

    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public double getPrice() {
        return price;
    }

}


