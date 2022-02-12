package com.mani.pradeep.tricky;

import java.util.ArrayList;
import java.util.List;

public class ObjectSample {
    public static void main(String[] args) {
        Object1 obj1 = new Object1();
        Object2 obj2 = new Object2();
        System.out.println(obj1.equals(obj2));
        //System.out.println(obj1==obj2);

        double d1 = 30.2f; // OK
       // Double d2 = 30.2f; // fail
//A list of Integer elements can not be assigned to a List of Object
// elements despite that Integer is a subclass of Object
        List<Object> objects = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
       // objects = integers;




    }
}
