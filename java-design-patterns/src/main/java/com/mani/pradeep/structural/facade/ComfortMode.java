package com.mani.pradeep.structural.facade;

public class ComfortMode implements DrivingMode{

    @Override
    public void activate() {
        //order matters
        automaticTransmission();
        cruiseControl();
        mildSuspension();
        System.out.println("!!!Comfort Mode Activated!!!");
    }

    void automaticTransmission() {
        System.out.println("Automatic transmission initiated.");
    }

    void cruiseControl() {
        System.out.println("Cruise control initiated.");
    }

    void mildSuspension() {
        System.out.println("Mild suspension profile activated.");
    }

}
