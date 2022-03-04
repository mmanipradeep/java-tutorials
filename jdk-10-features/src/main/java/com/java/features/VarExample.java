package com.java.features;

import java.util.ArrayList;

public class VarExample {

    public static void main(String[] args) {

        var list = new ArrayList<String>();  // infers ArrayList<String>
        var stream = list.stream();          // infers Stream<String>
        // Declaration of a local variable in java 10 using LVTI
        var x = "Hi there";
        // Declaring index variables in for loops using LVTI in Java
        for (var x2 = 0; x2 < 3; x2++) {
            System.out.println(x);
        }
        System.out.println(x);

       // Illegal Use of var:
      //  var name; // error: cannot use 'var' on variable without initialize
       // var emptyList = null; //error

       // var expression = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type
     //   var arrayList = { 1, 2, 3 }; // error: Array initializer is not allowed here

        //Not permitted in class fields(non-local variables)
     //   public var = "hello"; // error: 'var' is not allowed here


//Not allowed as parameter for any methods
       // void show(var a) /*Error:
//{
//}


//Not permitted in method return type
//public var show() /* Error: {
 //  return 1;
//}

    }
}
