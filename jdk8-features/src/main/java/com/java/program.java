package com.java;

import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class program {
    public static void main(String[] args) {
        final List<String> timeZonesInUS = Stream.of(TimeZone.getAvailableIDs())
                .filter(zoneId -> zoneId.startsWith("SG")).collect(Collectors.toList());
        System.out.println(com.ibm.icu.util.TimeZone.getAvailableIDs(countryCode));
    }
}
