package com.java.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    private static List getBeginWith(List<String> list, Predicate<String> valid) {
        List<String> selected = new ArrayList<>();
        list.forEach(country -> {     // lambda expression
            if(valid.test(country)) {
                selected.add(country);
            }
        });
        return selected;
    }
    public static void main(String[] args) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies"};
        List<String> countryList = Arrays.asList(countries);
        System.out.println(getBeginWith(countryList, (s) -> s.startsWith("A")));
        System.out.println(getBeginWith(countryList, (s) -> s.contains("W")));
        System.out.println(getBeginWith(countryList, (s) -> s.endsWith("nd")));
    }
}
