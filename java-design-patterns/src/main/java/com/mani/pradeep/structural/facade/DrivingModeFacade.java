package com.mani.pradeep.structural.facade;

public class DrivingModeFacade {
    static void selectMode(DriveMode mode) {
        switch (mode) {
            case SPORT:
                DrivingMode sportMode = new SportMode();
                sportMode.activate();
                break;
            case COMFORT:
                DrivingMode comfortMode = new ComfortMode();
                comfortMode.activate();
                break;
            default:
                System.out.println("Drive Mode not Selected");
                break;
        }
    }
}


enum DriveMode {
    SPORT,
    COMFORT,
}