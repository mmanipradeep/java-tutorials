package com.mani.linkedlist;


public class Node1 {

    private Node1 next;
    private String data;

    public Node1(String data) {
        this.data = data;
    }

    public String data() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node1 next() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public String toString() {
        return this.data;
    }

}
