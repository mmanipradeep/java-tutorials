package com.mani.pradeep.tricky;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Hello");
        set2.add("World");

        System.out.println(set1.equals(set2));
    }
}
