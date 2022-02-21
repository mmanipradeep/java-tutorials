package com.poc;

import java.util.concurrent.*;

public class FuturePOC {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorServiceObj = Executors.newSingleThreadExecutor();
        Callable<String> callableObj =() -> {
            display(1);
            return "welcome to future";
        };
        Future<String> futureObj =executorServiceObj.submit(callableObj);
        System.out.println("Next Task");
        String msg =futureObj.get();
        System.out.println(msg);
        executorServiceObj.shutdown();

    }

    public static void display(int i){
        try{
TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
e.printStackTrace();
        }
    }
}
