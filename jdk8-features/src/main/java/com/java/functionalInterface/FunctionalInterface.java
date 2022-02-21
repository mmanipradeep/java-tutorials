package com.java.functionalInterface;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String args[]) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka",
                "Newzealand", "West Indies", "Scotland"};
        Function<String[], String> converter = (all) -> {  // lambda expression
            String names = "";
            for(String n : all) {
                String result = n.substring(0, n.indexOf(""));
                result = n.substring(n.indexOf("")) + " " + result;
                names += result + "\n";
            }
            return names;
        };
        System.out.println(converter.apply(countries));


      //  andThen: function1.andThen(function2) will first apply function1 to the input and the result of this will be passed to the function2.

        //compose: function1.compose(function2) will first apply the input to the function2 and the result of this will be passed to the function1

        Function<Double,Double> half = (a) -> a / 2;
        Function<Double,Double> twice = (a) -> a *a;

        Function<Double , Double>  squareAndThenCube =half.andThen(twice);
        Double result =squareAndThenCube.apply(3d);
        System.out.println(result);

        Function<Double , Double>  squareComposeCube =half.compose(twice);
         result =squareComposeCube.apply(3d);
        System.out.println(result);



    }


}
