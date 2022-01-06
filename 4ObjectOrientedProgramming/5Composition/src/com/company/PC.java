package com.company;

//Now here PC comprises of case,monitor and motherboard or in other words it has-a case, monitor and motherboard.
//Furthermore Case has dimensions,Monitor has resolution and so on...
//Here we can clearly see the advantage of this we can extend Pc class to all these 3 but that will be a pain in the arse and
//JAVA DOES NOT SUPPORT MULTI-INHERITANCE!

public class PC {
    private Case theCase;//case is a reserved keyword in switch statement
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
    }
    public void drawPixel(){
        monitor.drawPixelAt(5,10,"green");
    }
    public void loadProgram(){
        motherboard.loadProgram("Windows 10");
    }
}
