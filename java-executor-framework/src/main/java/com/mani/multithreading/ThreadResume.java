package com.mani.multithreading;

import java.util.Objects;

public class ThreadResume extends Thread{

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
        ThreadResume thread1 = new ThreadResume();
        ThreadResume thread2 = new ThreadResume();
        ThreadResume thread3 = new ThreadResume();
        thread1.start();
        thread2.start();
        thread2.suspend();
        thread3.start();
        thread2.resume();
    }
}
