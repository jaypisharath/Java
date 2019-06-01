package com.jayp;

public class Main {

    public static void main(String[] args) {

        BasicBurger basicBurger = new BasicBurger("S Dough", "Roast Beef", "Onion", "Tomato", "Relish", "Swiss Cheese");
        System.out.println("basicBurger.getPrice() = " + basicBurger.getPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", "Onion", "Tomato", "Lettuce", "Relish", "Swiss Cheese", "Hot Sauce");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger("Bun", "Hamburger", "Onion", "Tomato");
        System.out.println("deluxeBurger = " + deluxeBurger.getPrice());
    }
}
