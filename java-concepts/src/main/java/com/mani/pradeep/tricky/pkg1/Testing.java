package com.mani.pradeep.tricky.pkg1;

public class Testing {
    public static void hello() {
        System.out.println("Hello from class");
    }

    public static void main(String[] args) {
        System.out.println(WeekDays.SATURDAY);
        InterfaceTesting.hello();
        Testing.hello();
    }
}
