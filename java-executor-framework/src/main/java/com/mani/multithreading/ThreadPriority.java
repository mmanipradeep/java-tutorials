package com.mani.multithreading;

public class ThreadPriority extends Thread {
    public static void main(String[] args) {
        ThreadPriority thread = new ThreadPriority();
        System.out.println(thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());
        System.out.println("Is thread Alive "+thread.isAlive());
        thread.start();
        System.out.println("Is thread Alive "+thread.isAlive());
    }
    public void run (){
        System.out.println(currentThread().getName());
    }
}
