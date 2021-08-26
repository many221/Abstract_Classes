package com.company;

public abstract class  Engine {

    private String name;
    private String manufacturer;
    private String engineMaterial;
    private String engineConfiguration;
    private String engineSound;
    private int turboCount = 0;
    private int engineDisplacement;
    private int horsePower;
    private int torque;
    private int weight;
    private int oilLimit;
    private int oilLevel = 0;

    public Engine(String name, String manufacturer, String engineMaterial, String engineConfiguration, String engineSound, int engineDisplacement, int horsePower, int torque, int weight, int oilLimit) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.engineMaterial = engineMaterial;
        this.engineConfiguration = engineConfiguration;
        this.engineSound = engineSound;
        this.engineDisplacement = engineDisplacement;
        this.horsePower = horsePower;
        this.torque = torque;
        this.weight = weight;
        this.oilLimit = oilLimit;
    }

    public void addOil(int oilQuaurts){

        if(oilQuaurts + oilLevel > oilLimit){
            System.out.println ("That's Too Much Oil. The oil capacity is " + oilLimit);
        }else oilLevel += oilQuaurts;

    }
    public void turboIt(){
        turboCount += 1;
        horsePower += 100;
        torque += 150;
        engineSound += " stutututututu";
    }

    public abstract void engineSound();

    public String getEngineSound() {
        return engineSound;
    }


    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getEngineMaterial() {
        return engineMaterial;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public int getTurboCount() {
        return turboCount;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public int getWeight() {
        return weight;
    }

    public int getOilLimit() {
        return oilLimit;
    }

    public int getOilLevel() {
        return oilLevel;
    }
}
