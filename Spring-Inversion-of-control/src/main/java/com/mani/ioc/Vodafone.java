package com.mani.ioc;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("alling Airtel Mobile ");
    }

    @Override
    public void data() {
        System.out.println("Browsing internat Airtel Mobile ");
    }
}
