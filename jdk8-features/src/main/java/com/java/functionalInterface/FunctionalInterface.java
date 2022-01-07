package com.java.functionalInterface;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String args[]) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka",
                "Newzealand", "West Indies", "Scotland"};
        Function<String[], String> converter = (all) -> {  // lambda expression
            String names = "";
            for(String n : all) {
                String result = n.substring(0, n.indexOf(""));
                result = n.substring(n.indexOf("")) + " " + result;
                names += result + "\n";
            }
            return names;
        };
        System.out.println(converter.apply(countries));
    }
}
