package com.mani.multithreading;

public class ThreadSleep extends Thread{

    public static void main(String[] args) {
        ThreadSleep thread =new ThreadSleep();
        thread.start();
        ThreadSleep thread1 =new ThreadSleep();
        thread1.start();
    }

    public void  run(){
        for(int i=1;i<5;i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
System.out.println(i);
        }
    }
}
