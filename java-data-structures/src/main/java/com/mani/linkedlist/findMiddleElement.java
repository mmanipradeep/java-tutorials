package com.mani.linkedlist;

import java.util.Optional;

public class findMiddleElement {

    public static Optional<String> findMiddleElementFromHead1PassIteratively(Node1 head) {
        /**
         * In this approach, we will have two node references.
         * First node, we increment by two steps
         * Second node, we increment ny one step.
         * At the end we get the middle element ny second node.
         */

        if (head == null) {
            return Optional.empty();
        }

        Node1 singleIncrement = head;
        Node1 doubleIncrement = head;

        while (doubleIncrement.hasNext() && doubleIncrement.next().hasNext()) {
            doubleIncrement = doubleIncrement.next().next();
            singleIncrement = singleIncrement.next();
        }
        System.out.println("Middle Element: "+ singleIncrement.data());
        return Optional.ofNullable(singleIncrement.data());
    }

}
