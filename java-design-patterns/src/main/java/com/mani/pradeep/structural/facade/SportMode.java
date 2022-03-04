package com.mani.pradeep.structural.facade;

public class SportMode implements DrivingMode{

    @Override
    public void activate() {
        //order matters
        manualTransmission();
        paddleShift();
        disableTractionControl();
        lanuchControl();
        System.out.println("!!!Sport Mode Activated!!!");
    }

    void manualTransmission() { System.out.println("Manual transmission enabled."); }

    void disableTractionControl() {
        System.out.println("Traction control disabled.");
    }

    void lanuchControl() {
        System.out.println("Launch control initiated.");
    }

    void paddleShift() {
        System.out.println("Paddle shifter enabled.");
    }
}
