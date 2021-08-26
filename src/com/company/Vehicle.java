package com.company;

import java.util.ArrayList;

public abstract class Vehicle {

    private String name;
   private int productionYear;
   private String manufacturer;
   private Engine engine;
   private Occupent driver;
   private boolean hasEngine =  false;
   private String typeOfMotion;
   private int passengerLimit;
   private int weight;
   private boolean hasDriver = false;
   private boolean isOn = false;
   private boolean isAutonomous = false;
   private ArrayList<Occupent> occupentList = new ArrayList<Occupent> ();
   private ArrayList<Payload> payloadList = new ArrayList<Payload> ();

    public Vehicle(String name, int productionYear, String manufacturer, String typeOfMotion, int passengerLimit, int weight) {
        this.name = name;
        this.productionYear = productionYear;
        this.manufacturer = manufacturer;
        this.typeOfMotion = typeOfMotion;
        this.passengerLimit = passengerLimit;
        this.weight = weight;
    }

    public abstract void start();

    public abstract void unStart();

    @Override
    public abstract String toString();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public void setAutonomous(boolean autonomous) {
        isAutonomous = autonomous;
    }

    public void setOn(boolean on) {
        isOn = on;
    }


    public void makeDriver(Occupent occupent){
        if(occupentList.contains ( occupent )) {
            driver = occupent;
            hasDriver = true;
        }
        else System.out.println ("Please add " + occupent.name + "to the vehicle");
    }
    public void addOccupents(Occupent occupent){
        occupentList.add ( occupent );
    }

    public void removeOccupents(int occupent){
        occupentList.remove ( occupent );
    }

    public boolean isHasDriver() {
        return hasDriver;
    }

    public void setHasDriver(boolean hasDriver) {
        this.hasDriver = hasDriver;
    }

    public void makeAutonomous(){
        System.out.println (name + " Can Now  Drive itself");
        isAutonomous = true;
    }

    public ArrayList<Occupent> getOccupentList() {
        return occupentList;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public Occupent getDriver() {
        return driver;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public String getTypeOfMotion() {
        return typeOfMotion;
    }

    public int getPassengerLimit() {
        return passengerLimit;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isAutonomous() {
        return isAutonomous;
    }
}
