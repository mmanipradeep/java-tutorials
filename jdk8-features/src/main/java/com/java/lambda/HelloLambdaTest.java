package com.java.lambda;

public class HelloLambdaTest {

    public static void main(String[] args) {

//        HelloLambda hello =new HelloLambda() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello");
//            }
//        };
//        hello.sayHello();
//    }


        HelloLambda HelloLambda = () -> {
            System.out.println("Hello");
        };
        HelloLambda.sayHello();
    }


}
