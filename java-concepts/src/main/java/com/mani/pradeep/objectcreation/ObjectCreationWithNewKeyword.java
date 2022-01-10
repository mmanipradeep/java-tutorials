package com.mani.pradeep.objectcreation;

public class ObjectCreationWithNewKeyword {

    /**
     * Using new keyword
     * Using new instance
     * Using clone() method
     * Using deserialization
     * Using newInstance() method of Constructor class
     */

    String name = "GeeksForGeeks";
    public static void main(String[] args)
    {
        // As usual and most generic used we will
        // be creating object of class inside main()
        // using new keyword
        ObjectCreationWithNewKeyword obj = new ObjectCreationWithNewKeyword();

        // Print and display the object
        System.out.println(obj.name);
    }


}
