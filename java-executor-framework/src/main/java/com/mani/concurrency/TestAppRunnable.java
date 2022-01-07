package com.mani.concurrency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestAppRunnable {

    public static void main(String[] args) {
        Runnable runnable =  () -> {
            String fileName = "c://lines.txt";
            List<String> list = new ArrayList<>();

            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

                //1. filter line 3
                //2. convert all content to upper case
                //3. convert it into a List
                list = stream
                        .filter(line -> !line.startsWith("line3"))
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

            } catch (IOException e) {
                e.printStackTrace();
            }

            list.forEach(System.out::println);
        };

        Thread thread =new Thread(runnable); // NEw state
        thread.start(); // Runnable
        //EXECUTING
        //Waiting for resource -  Wait state
        //once completed - then Termindated or dead

        //id ,name get priority, set priority 1-10
        //get state
        //get thread group
        //get is alive
      //  is deamon
        //is interupted
                // join
        //notify , notify all - communiation
        //inter thread communication - wait

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(runnable);

    }
}
