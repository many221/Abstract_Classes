package com.company;
import static java.lang.System.out;

public  abstract class Cat {
    private String name;
    private String color;
    private int weightInGrams;
    private boolean isNuetured;
    private String species;


    public Cat(String name, String color, int weightInGrams, boolean isNuetured, String species) {
        this.name = name;
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.isNuetured = isNuetured;
        this.species = species;
    }


    public void displayWeightInLbs(){

        int oz = weightInGrams/28;

        int lbs = oz/16;

        out.println (lbs);

    }

    public void nueterPet(){
        out.println ("Snip Snip");
        isNuetured = true;
    }

    public abstract void meow();
}
