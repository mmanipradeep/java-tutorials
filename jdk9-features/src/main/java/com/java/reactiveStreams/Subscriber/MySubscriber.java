package com.java.reactiveStreams.Subscriber;

import com.java.reactiveStreams.Employee;
import com.java.reactiveStreams.Freelancer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;
/**
 * 1. Main Class of Flow API
 * 2. Final Class and cant be extended
 * 3. Encapsulates all the important interfaces
 */
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.atomic.AtomicInteger;

public class MySubscriber<Employee> implements Flow.Subscriber<Employee> {

    private boolean completed = false;
    private final AtomicInteger howMuchMessagesToConsume;
    public List<Employee> consumedElements = new LinkedList<Employee>();
    public MySubscriber(Integer howMuchMessagesToConsume) {
        this.howMuchMessagesToConsume = new AtomicInteger(howMuchMessagesToConsume);
    }

    private Subscription subscription;

    private int counter = 0;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("Subscribed");
        this.subscription = subscription;
        this.subscription.request(1); //requesting data from publisher
        System.out.println("onSubscribe requested 1 item");
    }

    @Override
    public void onNext(Employee item) {

        howMuchMessagesToConsume.decrementAndGet();
        System.out.println("Got : " + item);
        consumedElements.add(item);
        System.out.println("Processing Employee "+item);
        counter++;
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Some error happened");
        e.printStackTrace();
    }

    @Override
    public void onComplete() {
        completed = true;
        subscription.cancel();
        System.out.println("All Processing Done");
    }

    public int getCounter() {
        return counter;
    }
}
