package com.mani.linkedlist;

public class CustomizedLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    private int size =0;

    static class Node<E>{
        /**
         * value and reference to next node
         * Type safety is benefit of Generics
         */
        Node<E> next;
        E value;
        Node(E value){
            this.value=value;
        }
    }

    public void addFirst(E value){
        /**
         * When we want to add elements at first let’s say 40,
         * we need to create a new node object and now create a link by doing temp. next = head
         * Now the head is pointing to null (40->null),
         * but the head should be pointing to starting of the linked list so, head = temp.
         */

        Node<E> temp =new Node<E>(value);
        temp.next=head;
        head=temp;

        if(tail==null){
            /**
             * Tail should have a reference of the last element if it is null till now,
             * that’s why I wrote: if the tail is null then tail = temp
             */
            tail=temp;
        }
        size ++;
    }

    public void addLast(E value){
        if(tail==null){
            addFirst(value);
            return;
        }
        Node<E> temp =new Node<E>(value);
        tail.next=temp;
        tail=temp;
        size++;
    }

    /**
     *
     * @return String representation of linked list .
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        Node<E> temp = head;
        while(temp!=null){
            builder.append(temp.value).append("->");
            if(temp==tail) builder.append("End");
            temp = temp.next;
        }
        return builder.toString();
    }
    /**
     *
     * @return size of linked list
     */
    public int getSize() {
        return size;
    }
}
