package com.mani.pradeep.equalsAndHashcode;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {

    /**
     *equals(Object otherObject) – verifies the equality of two objects. Its default implementation simply checks the object references of two objects to verify their equality.
     * By default, two objects are equal if and only if they are refer to the same memory location. Most Java classes override this method to provide their own comparison logic.
     *
     * hashcode() – returns a unique integer value for the object in runtime.
     * By default, integer value is derived from memory address of the object in heap (but it’s not mandatory).
     * The object’s hash code is used for determining the index location, when this object needs to be stored in some HashTable like data structure.
     */

    @Test
    public void EmplyeeTest(){
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        System.out.println(e1.equals(e2)); // False.


        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        System.out.println( employees.size());

        System.out.println( e1.hashCode() + ": "+ e2.hashCode());

    }

}
