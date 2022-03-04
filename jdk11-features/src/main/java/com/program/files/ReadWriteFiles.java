package com.program.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReadWriteFiles {

    public static void main(String[] args) throws IOException {

        //readString
        //writeString
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD


        //String
        // isBlank()
        //lines()
        //repeat()
        //strip()
        //stripLeading()
        //stripTrailing()


        String str1 = "";
        System.out.println(str1.isBlank());
        System.out.println(str1.lines().collect(Collectors.toList()));

        String str = "1".repeat(5);
        System.out.println(str);

        System.out.println("   hi  ".strip());
        System.out.println("   hi  ".stripLeading());
        System.out.println("   hi  ".stripTrailing());
    }
}
