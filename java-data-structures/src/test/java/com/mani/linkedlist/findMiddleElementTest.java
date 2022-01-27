package com.mani.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class findMiddleElementTest {

    private static Node1 createNodesList(int n) {
        Node1 head = new Node1("1");
        Node1 current = head;
        System.out.print( head +" ");
        for (int i = 2; i <= n; i++) {
            Node1 newNode = new Node1(String.valueOf(i));
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
