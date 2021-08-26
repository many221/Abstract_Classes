package com.company;

public class CombustionEngine extends Engine{

    String fuelType = "Gasoline";
    int octaneRating;

    public CombustionEngine(String name, String manufacturer, String engineMaterial, String engineConfiguration, String engineSound, int engineDisplacement, int horsePower, int torque, int weight, int oilLimit, int octaneRating) {
        super ( name, manufacturer, engineMaterial, engineConfiguration, engineSound, engineDisplacement, horsePower, torque, weight, oilLimit );
        this.octaneRating = octaneRating;
    }

    @Override
    public void engineSound() {
        System.out.println (getEngineSound ());
    }



}

