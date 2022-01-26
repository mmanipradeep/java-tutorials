package com.java.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorTeting {

    public static void main(String[] args) {



    }


    public void binaryOperator(){
        BinaryOperator<Integer> operator1 = (a, b) -> a + b;
        System.out.println(operator1.apply(5, 7));

        BinaryOperator<String> operator2 = (s1, s2) -> s1 + s2;
        System.out.println(operator2.apply("Hello ", "BORAJI.COM"));
    }

    public void binaryOperatorWithFunction(){
    BinaryOperator<Integer> operator = (a, b) -> a + b;
    Function<Integer, Integer> function = n -> n * 2;

    // Using andThen()
    System.out.println(operator.andThen(function).apply(1, 6));
    }

    public void minAndMaxBy(){
    Comparator<Integer> comparator = (a, b) -> (a.compareTo(b));

    // Using maxBy()
    BinaryOperator<Integer> opMax = BinaryOperator.maxBy(comparator);
    System.out.println("Max: " + opMax.apply(5, 6));
    System.out.println("Max: " + opMax.apply(9, 6));

    // Using minBy()
    BinaryOperator<Integer> opMin = BinaryOperator.minBy(comparator);
    System.out.println("Min: " + opMin.apply(5, 6));
    System.out.println("Min: " + opMin.apply(9, 6));
}
}
