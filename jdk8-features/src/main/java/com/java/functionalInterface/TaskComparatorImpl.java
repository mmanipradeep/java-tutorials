package com.java.functionalInterface;

/**
 * Where you can use Lambda expressions
 *
 * Lambda expressions can be used anywhere in Java 8 where we have a target type. In Java, we have target type in the following contexts
 *
 * Variable declarations and assignments
 * Return statements
 * Method or constructor arguments
 *
 *
 */

public class TaskComparatorImpl {
    public static void main(String[] args) {
        TaskComparator myTask = (int a1,int a2) -> {return a1>a2;};
        boolean result =myTask.compareTests(4,3);
        System.out.println(result);
    }

    /**
     * Where you can use Lambda expressions
     *
     * Lambda expressions can be used anywhere in Java 8 where we have a target type. In Java, we have target type in the following contexts
     *
     * Variable declarations and assignments
     * Return statements
     * Method or constructor arguments
     */
}
