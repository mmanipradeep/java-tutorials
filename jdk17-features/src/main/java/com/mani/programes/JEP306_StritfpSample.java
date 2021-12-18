package com.mani.programes;

public class JEP306_StritfpSample {
//Restore Always-Strict Floating-Point Semantics (JEP 306)
    // The default floating-point operations are strict or strictfp,
// both of which guarantee the same results from the floating-point calculations on every platform.
    // This strictfp can be removed


    public strictfp double sum() {
        double num1 = 10e+10;
        double num2 = 6e+08;
        return (num1 + num2);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {

        // Creating object of class in main() method
        JEP306_StritfpSample t = new JEP306_StritfpSample();

        // Here we have error of putting strictfp and
        // error is not found public static void main method
        System.out.println(t.sum());
    }
}
