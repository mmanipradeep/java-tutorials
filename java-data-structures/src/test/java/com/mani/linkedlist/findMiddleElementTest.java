package com.mani.linkedlist;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class findMiddleElementTest {

    private static Node createNodesList(int n) {
        Node head = new Node("1");
        Node current = head;
        System.out.print( head +" ");
        for (int i = 2; i <= n; i++) {
            Node newNode = new Node(String.valueOf(i));
            current.setNext(newNode);
            current = newNode;
            System.out.print(  current + " ");
        }
        return head;
    }


    @Test
    public void whenFindingMiddleFromHead1PassIteratively_thenMiddleFound() {
        assertEquals("3", findMiddleElement
                .findMiddleElementFromHead1PassIteratively(createNodesList(5))
                .get());
        assertEquals("2", findMiddleElement
                .findMiddleElementFromHead1PassIteratively(createNodesList(4))
                .get());
    }

}
