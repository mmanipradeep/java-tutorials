package com.java;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStrings {

    private static String PREFIX = "[";
    private static String SUFFIX = "]";
    public static void main(String[] args) {
        String subFolder  = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String baseDirectory="manual";
        String fileNme ="abc.txt";

        List<String> collect = Stream.of("welcome","to the","medium","where","we will", "learn","how to ","debug","streams","adding feeduplicate",
                "welcome","hello")
                .filter(s-> s.startsWith("w"))
                .map(s->s.substring(3))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<String> filePathParts = Arrays.asList(baseDirectory, subFolder,fileNme);
        String filePath = filePathParts.stream()
                .collect(Collectors.joining(File.separator));
        System.out.println(filePath);

        List<String> list = new ArrayList<>();
        list.add("a:1");
        list.add("b:2");
        list.add("c:3");

        StringJoiner joiner =new StringJoiner(";", PREFIX, SUFFIX);
        Map<String,String> map1= list.stream()
                .map(s -> s.split(":", 2))
                .collect(Collectors.toMap(a -> a[0], a -> a.length>1? a[1]: ""));
       map1.forEach((x, y) -> System.out.print("Key: " + x +", value: "+ y ) );

    }
}
