package com.mani.pradeep.structural.composite;

import javax.naming.OperationNotSupportedException;

/**
 * In software engineering, the composite pattern is a partitioning design pattern.
 * The composite pattern describes a group of objects that are treated the same way as a
 * single instance of the same type of object. The intent of a composite is to "compose"
 * objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern
 * lets clients treat individual objects and compositions uniformly.
 */
public class HRClient {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        Developer dev2 = new Developer();
        Developer dev3 = new Developer();
        dev1.setName("tom hardy");
        dev2.setName("dick tracey");
        dev3.setName("harry ford");
        Manager manager = new Manager();
        manager.setName("Mike Mitchel");
        try {
            manager.addReportee(dev1);
            manager.addReportee(dev2);
            manager.addReportee(dev3);
        }catch (OperationNotSupportedException onse) {
            onse.printStackTrace();
        }
        manager.printName();
    }
}
