package com.company;

public class HouseCat extends Cat {

    public HouseCat(String name, String color, int weightInGrams, boolean isNuetured, String species) {
        super ( name, color, weightInGrams, isNuetured, species );
    }

    @Override
    public void meow() {
        System.out.println ("Arf");
    }
}
