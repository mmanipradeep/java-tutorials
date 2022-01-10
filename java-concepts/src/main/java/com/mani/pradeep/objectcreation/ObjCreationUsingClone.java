package com.mani.pradeep.objectcreation;

public class ObjCreationUsingClone implements Cloneable{

    // Method 1
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        // Super() keyword refers to parent class
        return super.clone();
    }

    // Declaring and initializing string
    String name = "GeeksForGeeks";

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        ObjCreationUsingClone obj1 = new ObjCreationUsingClone();

        // Try block to check for exceptions
        try {

            // Using the clome() method
            ObjCreationUsingClone obj2 = (ObjCreationUsingClone)obj1.clone();

            // Print and display the main class object
            // as created above
            System.out.println(obj2.name);
        }

        // Catch block to handle the exceptions
        catch (CloneNotSupportedException e) {

            // Display the exception
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
}

