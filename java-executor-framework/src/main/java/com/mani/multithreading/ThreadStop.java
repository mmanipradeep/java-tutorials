package com.mani.multithreading;

public class ThreadStop extends Thread{

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

    public static void main(String[] args) {
        ThreadStop thread1 = new ThreadStop();
        ThreadStop thread2 = new ThreadStop();
        ThreadStop thread3 = new ThreadStop();
        thread1.start();
        thread2.start();
        thread3.stop();
        System.out.println("Thread 3 stopped");
    }

}
