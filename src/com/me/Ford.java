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
     //method for accelerating changes and gear changes
        public void accelerate(int rate){           //method that is unique for this class
            //changeGear is a method defined in car class
            int newVelocity = getCurrentVelocity() + rate; //rate can be + or -
            if(newVelocity == 0){
                stop();  //if new velocity is = to 0, then calling stop method from vehicle class
                changeGear(1); //if car stopped going to change gear to 1
            } else if (newVelocity > 0 && newVelocity <= 10){
                changeGear(1);
            } else if (newVelocity > 10 && newVelocity <= 20){
                changeGear(2);
            } else if (newVelocity > 20 && newVelocity <= 30){
                changeGear(3);
            } else {
                changeGear(4);
            }
            //*note, 2 if statements in method, and this one only has an if
            if(newVelocity >0 ){
                changeVelocity(newVelocity, getCurrentDirection());
            }

    }

}
