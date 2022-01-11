package com.mani.pradeep.creational.singleton;

public class EagerSingleton {
    /*
    // Static initializer based Java implementation of
// singleton design pattern
     */
    private static EagerSingleton obj = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return obj;
    }
}
