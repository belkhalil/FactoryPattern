package org.example.model;

public class MozambicanCheeseBurger extends Hamburger {
    public MozambicanCheeseBurger() {
        name="Mozambican Style Cheese burger";
        sauce="Spicy mozambican sauce";
        buns="some mozambican buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking mozambican cheese burger");
    }
}
