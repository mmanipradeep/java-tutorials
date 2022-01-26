package com.test.multithread;

public class ThreadLocalTest {
    public static void main(String[] args) {

        ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();

        threadLocalValue.set(1);
        Integer result = threadLocalValue.get();
    }
}
