package com.me;

public class Ford extends Car {

    //added this field specific for car, then remade constructor, which included new field
    //in addition to what i had created before
    private int warrantyLength;

    public Ford(int warrantyLength) {  //everything we passed are deleted from constructor
        super("Ford", "F250", 4, 2, 5, false); //passing these
        this.warrantyLength = warrantyLength; //now only need to pass 1 parameter

        //2nd constructor before we identified field and removed from params
        /*public Ford(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear, int warrantyLength) {
        super(name, size, wheels, doors, gears, isManual, currentGear);
        this.warrantyLength = warrantyLength;*/

        //1st constructor before adding field warrantyLength
        /* public Ford(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size, wheels, doors, gears, isManual, currentGear);
        */

    }

}
