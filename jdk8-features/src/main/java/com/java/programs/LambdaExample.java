package com.java.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
      System.out.println(numDifferentIntegers("a123bc34d8ef34"));
    }

    public static int numDifferentIntegers(String word) {
        return Arrays.stream(word.replaceAll("[a-z]+", " ").split(" "))
                .filter(s -> !"".equals(s))
                .map(s -> s.replaceFirst("^0+", ""))
                .collect(Collectors.toSet())
                .size();
    }
}
/**
 * ord.replaceAll("[a-z]+", " ") - We replace all successive letters with space. So we have numbers split with spaces. replaceAll() returns just one String.
 * word.replaceAll("[a-z]+", " ").split(" ") - We split numbers into an array of numbers (as string array). The first and last elements can be empty strings if we had space on the beginning or end of the string word.replaceAll("[a-z]+", " ")
 * Arrays.stream(word.replaceAll("[a-z]+", " ").split(" ")) - convert the array into the stream of elements
 * .filter(s -> !"".equals(s)) - removes possibly empty strings on the beginning or end of string stream
 * .map(s -> s.replaceFirst("^0+", "")) - transforms numbers (as strings) into strings without leading zeros. This is what tells regex ^0+. We remove just the first occurrence of this because there is just one beginning of the string :-). replaceAll() would also work.
 * .collect(Collectors.toSet()) - makes set from string stream. Duplicates are eliminated because this is set
 * .size() - The size of the set is number of different numbers
 * We didn’t use Long.parseLong() or Integer.parseInt() because a number of digits in a number can be quite big and we would have exceptions. Because of that, we have used a set of strings.
 */