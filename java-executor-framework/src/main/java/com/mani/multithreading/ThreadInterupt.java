package com.mani.multithreading;

public class ThreadInterupt extends Thread {

    public static void main(String[] args) {
        ThreadInterupt thread = new ThreadInterupt();
        ThreadInterupt thread2 =new ThreadInterupt();
        thread.start();
        thread2.start();
        System.out.println("Thred interupted "+thread.isInterrupted());
        thread.interrupt();
        System.out.println("Thred interupted "+thread.isInterrupted());


    }
}
