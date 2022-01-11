package com.mani.pradeep.behavioural.Observer;



public interface Subject {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void notifySubscribers(String tweet);
}
