package com.mani.pradeep.singleton;

public class ClassicSingleton {
    /**
     * // Classical Java implementation of singleton
     * // design pattern
     * Note that Singleton obj is not created until we need it and call getInstance() method. This is called lazy instantiation.
     * The main problem with above method is that it is not thread safe
     */

    private static ClassicSingleton obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private ClassicSingleton() {}

    public static ClassicSingleton getInstance() {
        if (obj==null)
            obj = new ClassicSingleton();
        return obj;
    }
}
