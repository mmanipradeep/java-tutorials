package com.java.reactiveStreams.Subscriber;

import com.java.reactiveStreams.Freelancer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicInteger;


public class MyFreelancerSubscriber implements Flow.Subscriber<Freelancer> {
    private Flow.Subscription subscription;

    private int counter = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Subscribed for Freelancer");
        this.subscription = subscription;
        this.subscription.request(1); //requesting data from publisher
        System.out.println("onSubscribe requested 1 item for Freelancer");
    }

    @Override
    public void onNext(Freelancer item) {
        System.out.println("Processing Freelancer "+item);
        counter++;
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Some error happened in MyFreelancerSubscriber");
        e.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("All Processing Done for MyFreelancerSubscriber");
    }

    public int getCounter() {
        return counter;
    }
}
