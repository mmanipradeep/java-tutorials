package com.program.strings;

public class MainProgram {
    public static void main(String[] args) {
       // .equals --> value of
            //==  reference
        String one="hello";
        String two ="hello";

        if(one == two){
            System.out.println("both are same");
        }else{
            System.out.println("both are differenct");
        }

        String three = new Integer(76).toString().intern();
        String four="76";

        if(three == four){
            System.out.println("both are same");
        }else{
            System.out.println("both are differenct");
        }
/**
 * Basically doing String.intern () on a series of strings will ensure that all strings having same contents share same memory. So if you have list of names where 'john' appears 1000 times, by interning you ensure only one 'john' is actually allocated memory. This can be useful to reduce memory requirements of your program.
 */
    }
}
