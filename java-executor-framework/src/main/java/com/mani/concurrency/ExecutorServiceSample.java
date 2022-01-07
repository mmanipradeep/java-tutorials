package com.mani.concurrency;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceSample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
       // ExecutorService service = Executors.newCachedThreadPool();
       // ExecutorService service = Executors.newWorkStealingPool();
       // ExecutorService service = Executors.newFixedThreadPool(3,3);
     //   ExecutorService service = Executors.newCachedThreadPool(3,3);
List<String> users =null;// get details from the database
        UserDao userDao =new UserDao();

        for(String user : users){
            Future<Integer> future = service.submit(new UserProcessor(user,userDao));
            System.out.println(future.get());
        }

service.shutdown();
    }
}
