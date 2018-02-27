package com.me;

public class Ford extends Car {

    //added this field specific for car, then remade constructor, which included new field
    //in addition to what i had created before
    private int warrantyLength;

    public Ford(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear, int warrantyLength) {
        super(name, size, wheels, doors, gears, isManual, currentGear);
        this.warrantyLength = warrantyLength;
    }

   /* public Ford(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size, wheels, doors, gears, isManual, currentGear);
    }*/

}
