package com.mani.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Logger;

public class InvokeApiSample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Callable<Boolean>> callables= new ArrayList<>();

        callables.add(new LoginProcessors());
        callables.add(new LoginProcessors());

        List<Future<Boolean>> listofFutures =service.invokeAll(callables);

        for(Future<Boolean> future : listofFutures){
            System.out.println(future.get());
        }

        System.out.println(service.invokeAny(callables));

        service.shutdown();
        try{
            service.awaitTermination(30,TimeUnit.SECONDS);
        }catch(InterruptedException e){
            service.shutdownNow();
            Logger.getLogger("");
        }

    }
}
