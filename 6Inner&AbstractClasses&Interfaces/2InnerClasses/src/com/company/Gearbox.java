package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private boolean clutchIsIn;
    private int maximumGear;
    private int currentGearNumber = 0;//currentGearNumber was gearNumber before

    public Gearbox(int maximumGear) {
        this.maximumGear = maximumGear;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);//making a new gear object
        gears.add(neutral);//adding neutral gear object to gears array list
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int gearNumber, double ratio) {
        if (gearNumber > 0 && gearNumber <= maximumGear) {
            gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && clutchIsIn) {
            currentGearNumber = newGear;
            System.out.println("gear " + newGear + " selected!");
        } else {
            System.out.println("!!!grind!!!");
            currentGearNumber = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * gears.get(currentGearNumber).getRatio();
    }

    //Now we will make a class inside GearBox class named 'Gear'
    //Now gear itself alone is not that useful, so its nested in the GearBox class and it makes it useful. So that's the idea of inner classes.
    //So when it doesn't make sense to refer to something except the context given. We should use inner classes.
    private class Gear {
        private int gearNumber;//as we can see the Gearbox class also has gearNumber as an integer. But in constructor this,gearNumber (of Gear class) is sort of
        private double ratio;  //shadowing the Gearbox's gearNumber.This is not a good thing to do as it leads to confusion.
        //To resolve this either refer to the class first bu using Gearbox.this.gearNumber = gearNumber or name them different(preferred) ,it depends on your preference.

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public void setGearNumber(int gearNumber) {
            this.gearNumber = gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }

        public double driveSpeed(int numberOfRotations) {
            return ratio * numberOfRotations;
        }
    }
}
