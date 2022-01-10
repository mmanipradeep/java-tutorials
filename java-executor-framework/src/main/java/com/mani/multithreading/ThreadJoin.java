package com.mani.multithreading;

public class ThreadJoin extends Thread{
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin thread1 =new ThreadJoin();
        ThreadJoin thread2 =new ThreadJoin();
        ThreadJoin thread3 =new ThreadJoin();
        thread1.start();
thread1.join();
        thread2.start();
        thread3.start();
    }

    public void run(){
        for(int i=1;i<=4;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
