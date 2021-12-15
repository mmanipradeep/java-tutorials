package com.mani.pradeep;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int [] sortedArray ={2,4,6,8,3};
        int key=3;
        int index = Arrays.binarySearch(sortedArray, key);
        System.out.println(index);
    }
}
