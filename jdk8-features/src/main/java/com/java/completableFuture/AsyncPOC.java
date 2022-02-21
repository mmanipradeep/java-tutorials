package com.java.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncPOC {
    public static void main(String[] args) {
        Runnable runnable = ()-> {
            delay(1);
            System.out.println("IN runnable "+Thread.currentThread().getName());
        };
        CompletableFuture<Void>future =CompletableFuture.runAsync(runnable);
        System.out.println("In main "+Thread.currentThread().getName());
        future.join();
    }

    public static void delay(int i){
        try {
            TimeUnit.SECONDS.sleep(i);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
