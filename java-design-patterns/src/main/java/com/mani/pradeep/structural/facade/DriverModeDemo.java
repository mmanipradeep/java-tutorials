package com.mani.pradeep.structural.facade;

public class DriverModeDemo {

    public static void main(String[] args) {
        System.out.println("=== Activating SPORT Mode ======");
        DrivingModeFacade.selectMode(DriveMode.SPORT);
        //Switching to COMFORT Mode
        System.out.println("=== Switching to COMFORT Mode ======");
        DrivingModeFacade.selectMode(DriveMode.COMFORT);
    }

}
