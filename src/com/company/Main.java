package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
//
//        HouseCat garfield = new HouseCat ( "Garfield","Orange",2_500,false,"Persian Tabby" );
//        garfield.nueterPet ();
//        garfield.displayWeightInLbs ();

        Occupent Manny = new Occupent ( "Manny",22,58,158 );
        CombustionEngine lsx = new CombustionEngine ( "LS1","Cheverolet","Aluminum","V8","Vrrroom Vrrroom",57,350,365,460,5
        ,89);
        Car nineFourFour = new Car ( "944",1984,"Porsche",4,2400,4,15,2,1);

      nineFourFour.addEngine ( lsx );
      nineFourFour.addOccupents ( Manny );
      Manny.driveSchool ();
      Manny.givenKey ();
      nineFourFour.makeDriver ( Manny );
      nineFourFour.getEngine ().turboIt ();
      nineFourFour.start ();
    }
}
