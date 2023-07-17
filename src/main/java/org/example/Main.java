package org.example;

import org.example.interfaces.HamburgerStore;
import org.example.model.Hamburger;
import org.example.model.JamHamburgerStore;
import org.example.model.MozHamburgerStore;

public class Main {
    public static void main(String[] args) {
        HamburgerStore mozambicanStore = new MozHamburgerStore();

        HamburgerStore jamaicanStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanStore.orderHamburger("cheese");
        System.out.println("aba ordered "+hamburger.getName());

        hamburger = jamaicanStore.orderHamburger("veggie");
        System.out.println("abdeljabar "+hamburger.getName());

    }
}