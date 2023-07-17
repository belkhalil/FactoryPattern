package org.example.model;

public class JamaicanVeggieBurger extends Hamburger {
    public JamaicanVeggieBurger() {
        name="Jamaican Style veggie burger";
        sauce="Spicy jamaican sauce";
        buns="some jamaican buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking jamaican Veggie burger");
    }
}
