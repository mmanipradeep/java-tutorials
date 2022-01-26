package com.program.strings;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLineNumber {


    public static void main(String[] args) throws IOException {
        find("pradeep", new File("C:\\Users\\mmani\\IdeaProjects\\java-tutorials\\java-strings\\src\\main\\resources\\file.txt"));
        wordCount();
    }

    public static ArrayList<Integer> find(String word, File text) throws IOException {
        LineNumberReader rdr = new LineNumberReader(new FileReader(text));
        ArrayList<Integer> results = new ArrayList<Integer>();
        try {
            String line;
            while ((line = rdr.readLine()) != null) {
                if (line.indexOf(word) >= 0) {
                    results.add(rdr.getLineNumber());
                }
            }
        } finally {
            rdr.close();
        }
        System.out.println(results.toString());
        return results;
    }

    public static Map<String, Integer> wordCount() {

        String str = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";

        List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
        System.out.println(wordCounter);
        return wordCounter;

    }

}