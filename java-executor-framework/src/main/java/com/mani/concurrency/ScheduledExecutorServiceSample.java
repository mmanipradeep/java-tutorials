package com.mani.concurrency;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceSample implements Runnable{

    //SubInsterface of ExecutorService
    //schedule()executes Callbale/ Runnable
    //Schedulewith Fixeddelay
    //ScheduleAtFixedRate
    public static void main(String[] args) {
// Read the filesfrom the folder  for archical or for deletion

       ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
     //   service.schedule(new ScheduledExecutorServiceSample(),5, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new ScheduledExecutorServiceSample(),5,4,TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new ScheduledExecutorServiceSample(),5,4,TimeUnit.SECONDS);
// 2 SEC TO TASK TO  execute
    }

    @Override
    public void run() {
        //method to dlete or archival the file
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
