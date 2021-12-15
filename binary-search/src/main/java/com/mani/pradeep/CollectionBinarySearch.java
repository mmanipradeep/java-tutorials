package com.mani.pradeep;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionBinarySearch {
    public static void main(String[] args) {
        Integer[] spam = new Integer[] {2,4,6,8,3};
        List<Integer> list = Arrays.asList(spam);
        int key=3;
        int index = Collections.binarySearch(list, key);
        System.out.println(index);
        }

}
