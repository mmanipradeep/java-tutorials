package com.java.collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.stream.Stream;

public class CollectionListTest {

    @Test
    public void whenUsingStreamToList_thenReturnImmutableList() {

        // toList) from Java 16
        List<String> immutableList = Stream.of("a", "b", "c", "d").toList();

        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            immutableList.add("e");
        });
    }
}
