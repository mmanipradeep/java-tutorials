package com.program.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteFiles {

    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD
    }
}
