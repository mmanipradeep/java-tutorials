package com.java.collection;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class ListExmaple {


    public static void main(String[] args) {

        //toUnmodifiableList  from Java 10

        List<String> givenList = Arrays.asList("a","b","c");
        List<String> result = givenList.stream().collect(Collectors.toUnmodifiableList());

        List<String> givenList1 = Arrays.asList("a", "b", "c");
        List<String> result1 = givenList1.stream()
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));

        System.out.println(result.getClass());

        List immutableEmptyList = List.of();
        List immutableList = List.of("Abc", "Def", "Ghi");
        Map emptyImmutableMap = Map.of();
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
    }

}
