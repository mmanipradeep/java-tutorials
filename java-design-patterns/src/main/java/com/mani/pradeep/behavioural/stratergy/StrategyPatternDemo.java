package com.mani.pradeep.behavioural.stratergy;

public class StrategyPatternDemo {
    /**
     * In computer programming, the strategy pattern (also known as the policy pattern)
     * is a behavioral software design pattern that enables selecting an algorithm at runtime.
     * Instead of implementing a single algorithm directly, code receives run-time instructions
     * as to which in a family of algorithms to use.
     *
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
