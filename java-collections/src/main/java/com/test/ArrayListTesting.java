package com.test;

import java.util.*;

public class ArrayListTesting {
    public static void main(String[] args) {

//        List<String> strList = new ArrayList<String>();
//
//
//        strList.add("mani");
//        while(strList.iterator().hasNext()){
//            strList.add("pradeep");
//        }
//        System.out.println(strList);
        Map<String,Integer> map = new HashMap<>();
        map.put("head",10);
        map.put("head",12);
        System.out.println(map.get("head"));


        List<Integer> L = new LinkedList<Integer>();
        L.add(0);
        L.add(1);
        L.add(2);
        for (ListIterator<Integer> i = L.listIterator(); i.hasNext(); ) {
            int x = i.next();
            i.add(x + 10);
        }
        System.out.println(L);


        List<String> names = new LinkedList<>();
        names.add("Welcome");
        names.add("To");
        names.add("Gfg");

        // Getting ListIterator
        ListIterator<String> namesIterator
                = names.listIterator();

        // Traversing elements
        while (namesIterator.hasNext()) {
            names.add("Mani");
            System.out.println(namesIterator.next());
        }

        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }

}
