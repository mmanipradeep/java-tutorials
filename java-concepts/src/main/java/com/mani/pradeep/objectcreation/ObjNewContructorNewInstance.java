package com.mani.pradeep.objectcreation;

import java.lang.reflect.Constructor;

public class ObjNewContructorNewInstance {
    // Member variables of this class
    private String name;

    // Constructor of this class
    ObjNewContructorNewInstance() {}

    // Method 1
    // To set name ofthe string
    public void setName(String name)
    {
        // This method refers to current object itself
        this.name = name;
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Try block to check fo exceptions
        try {
            Constructor<ObjNewContructorNewInstance> constructor
                    = ObjNewContructorNewInstance.class.getDeclaredConstructor();

            ObjNewContructorNewInstance r = constructor.newInstance();

            // Custom passing
            r.setName("GeeksForGeeks");
            System.out.println(r.name);
        }

        // Catch block to handle the exceptions
        catch (Exception e) {

            // Display the exception on console
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
}
