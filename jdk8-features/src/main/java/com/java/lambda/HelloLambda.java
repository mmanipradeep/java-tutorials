package com.java.lambda;

/**
 *  Using lambda expression, sequential and parallel execution can be achieved by passing behavior into methods.
 *
 *  lambdas can be thought of as an anonymous method with a more compact syntax
 *
 *  Compact means that it is not mandatory to specify access modifiers,
 *  return type and parameter types while defining the expression.
 *
 *  can easily distribute processing of collection over multiple threads
 *
 *  In Java 8, using lambda expression and Stream API we can pass processing logic of elements into methods provided
 *  by collections and now collection is responsible for parallel processing of elements and not the client.
 *
 *  Also, parallel processing effectively utilizes multicore CPUs used nowadays.
 *
 *  Java 8 provide support for lambda expressions only with functional interfaces
 *
 *  Also, the syntax of the lambda expression says that we can omit curly braces ({}) in case of a single statement in the method body.
 *  In case of multiple statements, we should use curly braces as done in the above example.
 */
public interface HelloLambda {
    void sayHello();
}
