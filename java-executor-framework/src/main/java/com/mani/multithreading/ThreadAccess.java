package com.mani.multithreading;

public class ThreadAccess extends Thread{

    public static void main(String[] args) {
        ThreadAccess thread1 =new ThreadAccess();
        ThreadAccess thread2 =new ThreadAccess();
        thread1.checkAccess();
        System.out.println(thread1.getName()+"has access");
        thread1.start();
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"finished");
}

}
