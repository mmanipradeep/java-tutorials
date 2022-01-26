package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    /**
     * Sequential and Parallel Execution Support by passing behavior in methods
     * @param args
     */
    public static void main(String[] args) {

    }


    public void usingForLoop(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        for(String s:stringList){
            System.out.println(s);
        }
    }

    public void forEach(){
        List<String> strList=new ArrayList<>();
        strList.stream().forEach(s-> System.out.println(s));
    }
}
