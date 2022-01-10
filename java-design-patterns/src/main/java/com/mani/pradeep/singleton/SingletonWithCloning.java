package com.mani.pradeep.singleton;

public class SingletonWithCloning {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Singleton2 instance1 = Singleton2.instance;
        Singleton2 instance2 = (Singleton2) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
