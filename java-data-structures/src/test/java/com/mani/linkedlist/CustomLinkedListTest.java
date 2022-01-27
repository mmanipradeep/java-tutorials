package com.mani.linkedlist;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class CustomLinkedListTest {

    @Test
    public void insertLinkedList(){
        CustomLinkedList linkedList =new CustomLinkedList();
        linkedList.insert(5);
        linkedList.printList();
        linkedList.insert(10);
        linkedList.printList();
        linkedList.checkloop();
       // linkedList.deleteNodeAt(1);

    }

//    @Test
//    @Ignore
//    public void printLinkedList(){
//        CustomLinkedList linkedList =new CustomLinkedList();
//    }
}
