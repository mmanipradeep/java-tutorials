package com.mani.pradeep.aggregation;

public class Employee {
    String empname;
    int empid;
    Car car;

    Employee(String empname, int empid, Car car) {
        this.empname = empname;
        this.empid = empid;
        this.car = car;
    }
    public static void main(String[] args) {
        Car car = new Car("Dezire","blue","KA 02 B 5544");
        Employee e = new Employee("Raj",456234,car);
        System.out.println("----------Employee Details:------------");
        System.out.println("Employee Name: " + e.empname);
        System.out.println("Employee ID: " + e.empid);
        System.out.println("----------Employee's car details-------");
        System.out.println("Car Name: " + e.car.carname);
        System.out.println("Car color: " + e.car.color);
        System.out.println("Car Reg No: " + e.car.regno);
    }

}
