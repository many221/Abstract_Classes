package com.company;

public class Car extends Vehicle {

    public static final String[] carTypes = new String[]{"Sedan","Coupe","Convertible","Truck","HatchBack","Van","Suv","MiniVan"};
    private int tireCount;//HashMaps for all four tires to keep track and add values
    private int tireSize;
    private int doorCount;
    private int carType;


    public Car(String name, int productionYear, String manufacturer, int passengerLimit, int weight, int tireCount, int tireSize, int doorCount, int carType) {
        super ( name, productionYear, manufacturer,"Drives" , passengerLimit, weight );
        this.tireCount = tireCount;
        this.tireSize = tireSize;
        this.doorCount = doorCount;
        this.carType = carType;
    }

    public void addEngine(Engine newEngine){

      setEngine ( newEngine );
      setHasEngine ( true );

    }

    public void makeSelfDriving(){
        System.out.println ("Your Car Can Now Drive Better Than You! ");
        setAutonomous ( true );
    }


   public void getWeightToPowerRatio(){

        int wpr = getEngine ().getHorsePower ()/getWeight ();
        System.out.println (getName () + " Has A Weight To Power Ratio of " + wpr);

    }

    @Override
    public String toString() {

        String output = "| Year: " +  getProductionYear () + " | Make: " + getManufacturer ()  + " | Name: " + getName ()   + " | Driver: " +  getDriver ().name + " | Engine: " + getEngine () + " | Horse Power: " + getEngine ().getHorsePower ();
        return output;
    }

    @Override
    public void start() {
     if (isHasEngine ()){
         if(!getOccupentList ().isEmpty ()) {
             if (isHasDriver ()) {
                 if (getDriver ().canDrive) {
                     if (getDriver ().hasKey) {
                         if (getDriver ().age > 15) {
                             setOn ( true );
                             getEngine ().engineSound ();
                         } else
                             System.out.println ( getDriver ().name + " Is Too Young To Drive! Please Choose Someone Older" );
                     } else
                         System.out.println ( getDriver ().name + " Can Drive But Doesn't Have The Keys! Please Give Them The Keys. " );
                 } else System.out.println ( getDriver ().name + " Doesn't Know How To Drive! PLease Teach Them. " );

             } else System.out.println ( "Car Does Not Have Driver! Please add one! " );
         } else System.out.println ("Car is Empty! Please add occupents! ");
    }else System.out.println ("Car Does Not Have an engine! Please add one! ");
    }

    @Override
    public void unStart() {
        if(isOn()){
            setOn ( false );
            System.out.println ("Your Neighbors Are Happy That They Can Hear Again");
        }
        System.out.println ("You Can't Turn Off Somethings That's Already Off");
    }

}
