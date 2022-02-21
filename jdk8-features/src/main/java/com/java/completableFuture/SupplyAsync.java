package com.java.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplyAsync {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            System.out.println("In supplier "+ Thread.currentThread().getName());
            return "Hello from supplier";
        };

        CompletableFuture<String> future =CompletableFuture.supplyAsync(supplier);
        System.out.println("In main "+Thread.currentThread().getName());
        String res=future.join();
        System.out.println("Response"+res);
    }

    public static void delay(int i){
        try {
            TimeUnit.SECONDS.sleep(i);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
