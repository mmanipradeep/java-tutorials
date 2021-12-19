package com.java.programs;

import java.util.Comparator;

public class CompareObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1001, "Sam", 20000);
        Employee employee2 = new Employee(1002, "Sam", 20000);
        if(doCompareEmployees(employee1, employee2)){
            System.out.println("Both employee objects are same.");
        }else{
            System.out.println("Both employee objects are not same.");
        }

//Here is compare method using java 8
    }
    private static boolean doCompareEmployees(Employee employee1, Employee employee2) {
        int returnValue = Comparator.comparing(Employee::getId)
                .thenComparing(Employee::getName)
                .thenComparing(Employee::getSalary)
                .compare(employee1, employee2);
        if (returnValue != 0){
            return false;
        }
        return true;
    }
}
