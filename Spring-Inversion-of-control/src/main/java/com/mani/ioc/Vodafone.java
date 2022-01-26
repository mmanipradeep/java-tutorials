package com.mani.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("calling Vodafone Mobile ");
    }

    @Override
    public void data() {
        System.out.println("Browsing Internet Vodafone Mobile ");
    }
}
