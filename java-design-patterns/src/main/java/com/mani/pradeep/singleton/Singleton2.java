package com.mani.pradeep.singleton;

public class Singleton2 extends SuperClass{
    // public instance initialized when loading the class
    public static Singleton2 instance = new Singleton2();

    private Singleton2()
    {
        // private constructor
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
