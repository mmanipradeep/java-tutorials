package com.java.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {
    private static void printNames(Supplier<String> arg) {
        System.out.println("print Names"+arg.get());
    }
    private static void listBeginWith(List<String> list, Predicate<String> valid) {
        printNames(() -> "\nList of countries:");
        list.forEach(country -> {     // lambda expression
            if(valid.test(country)) {
                printNames(() -> country);
            }
        });
    }
    public static void main(String[] args) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies"};
        List<String> countryList = Arrays.asList(countries);
        listBeginWith(countryList, (s) -> s.startsWith("I"));
        listBeginWith(countryList, (s) -> s.contains("I"));
        listBeginWith(countryList, (s) -> s.endsWith("ia"));
    }
}
