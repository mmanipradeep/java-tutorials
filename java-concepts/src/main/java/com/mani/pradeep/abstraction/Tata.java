package com.mani.pradeep.abstraction;

public class Tata extends Car{
    @Override
    void stop() {
        System.out.println("Car has been stopped");
    }

    @Override
    String modelNumber() {
        return "XZ+DT12";
    }

    public static void main(String[] args) {
        Car car =new Tata();
        car.stop();
        System.out.println(car.modelNumber());
    }
}
