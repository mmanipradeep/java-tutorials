package com.java.functionalInterface;

import java.util.Arrays;

public class ConsumerInterface {
    public static void main(String[] args) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies"};
        System.out.print("The list of countries:\n");
        Arrays.asList(countries).forEach((country) -> System.out.println(country)); // lambda expression
    }
}
