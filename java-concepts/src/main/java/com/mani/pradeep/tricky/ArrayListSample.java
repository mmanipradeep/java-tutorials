package com.mani.pradeep.tricky;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(3);
        System.out.println("size 1 : " + arr.size());
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("size 2 : " + arr.size());
    }
}
