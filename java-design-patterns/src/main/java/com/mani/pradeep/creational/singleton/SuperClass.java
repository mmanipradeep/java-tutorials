package com.mani.pradeep.creational.singleton;

public class SuperClass implements Cloneable{
    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
