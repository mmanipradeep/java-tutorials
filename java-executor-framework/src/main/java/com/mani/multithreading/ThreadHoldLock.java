package com.mani.multithreading;

public class ThreadHoldLock  implements Runnable{
    public static void main(String[] args) {
        ThreadHoldLock g1 = new ThreadHoldLock();
        Thread thread1 = new Thread(g1);
        thread1.start();

    }

    public void run(){
        System.out.println(Thread.holdsLock(this));
        synchronized (this){
            System.out.println(Thread.holdsLock(this));
        }
    }
}
