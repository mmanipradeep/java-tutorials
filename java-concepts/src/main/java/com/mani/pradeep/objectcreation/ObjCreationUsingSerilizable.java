package com.mani.pradeep.objectcreation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjCreationUsingSerilizable implements Serializable {

    public static void main(String args[])
    {
        try
        {
//Creating the object
            Employee emp = new Employee(198054,"Andrew");
//Creates a stream and writes the object
            FileOutputStream fout=new FileOutputStream("employee.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.flush();
//closes the output stream
            out.close();
            System.out.println("Successfully Created");
        }
catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
