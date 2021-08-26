package com.company;

public class Occupent {
    String name;
    int age;
    int height;
    int weight;
    boolean hasKey = false;
    boolean canDrive = false;

    public Occupent(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void givenKey(){
        System.out.println (name + " Has Been Given A Key");
        hasKey = true;
    }

    public void driveSchool(){
        System.out.println (name + " Has Been Sent To Driving School And Can Now Drive ");
        canDrive = true;
    }


}
