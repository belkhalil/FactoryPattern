package org.example.model;

public class JamaicanCheeseBurger extends Hamburger {
    public JamaicanCheeseBurger() {
        name="Jamaican Style Cheese burger";
        sauce="Spicy jamaican sauce";
        buns="some jamaican buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking jamaican cheese burger");
    }
}
