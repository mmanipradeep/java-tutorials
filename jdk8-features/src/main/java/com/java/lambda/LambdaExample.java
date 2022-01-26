package com.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

    }


}
