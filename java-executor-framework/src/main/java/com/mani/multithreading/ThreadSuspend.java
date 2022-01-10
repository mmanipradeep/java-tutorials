package com.mani.multithreading;

public class ThreadSuspend  extends Thread{
    public static void main(String[] args) {
        ThreadSuspend thread1 = new ThreadSuspend();
        ThreadSuspend thread2 = new ThreadSuspend();
        ThreadSuspend thread3 = new ThreadSuspend();
        thread1.start();
        thread2.start();
        thread2.suspend();
        thread3.start();
    }

    public void run(){
        for (int i=0;i<4;i++){
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
