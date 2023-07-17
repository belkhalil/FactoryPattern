package org.example.model;

public class MozambicanVeggieBurger extends Hamburger {
    public MozambicanVeggieBurger() {
        name="Mozambican Style Veggie burger";
        sauce="Spicy mozambican sauce";
        buns="some mozambican buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking mozambican Veggie burger");
    }
}
