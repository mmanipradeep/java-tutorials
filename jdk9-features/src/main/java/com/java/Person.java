package com.java;

public interface Person {
//From Java 9, we can create private methods inside an interface that help to share common code between non-abstract methods.
    private Long createId(){

        return null;
    }

    private static void displayDetails(){


    }
}
