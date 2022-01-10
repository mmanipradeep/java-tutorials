package com.mani.multithreading;

public class threadYeild extends Thread {

    public static void main(String[] args) {
        threadYeild thread1 = new threadYeild();
        threadYeild thread2 = new threadYeild();
        thread1.start();
        thread2.start();
        for (int i=0; i<3;i++){
            thread1.yield();
            System.out.println(Thread.currentThread().getName() + "in control");
        }
    }
    public void run (){
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName() + "in control");
        }
    }
}
