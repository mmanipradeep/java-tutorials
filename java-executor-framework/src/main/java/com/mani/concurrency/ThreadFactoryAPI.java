package com.mani.concurrency;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryAPI implements ThreadFactory {

    private static int counter =0;
    @Override
    public Thread newThread(Runnable r) {

        Thread thread =new Thread(r);
        thread.setName("custom Thread "+ ++counter);
        return thread;
    }
}
