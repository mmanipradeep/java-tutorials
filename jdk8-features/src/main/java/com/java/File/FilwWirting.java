package com.java.File;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilwWirting {

    /**
     * 1. Using JAva 8
     * 2. Buffered Writer
     * 3 .FileWriter
     * 4.PrintWriter
     * 5. FileOutputStream
     * 6.DataOutputStream
     * 7. ObjectOutputStream
     * 8. cessFile
     *
     *
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        //Reading data from existing file.
        List<String> lines = Files.readAllLines(Paths.get("D:\\demo\\source.txt"));
        // Add some more data.
        lines.add("This is one addition line");
        //Write data into another file.
        Files.write(Paths.get("D:\\demo\\dest.txt"), lines);


        RandomAccessFile writer = new RandomAccessFile("D:\\demo\\random.txt", "rw");
        writer.seek(5);
        writer.write("Data".getBytes());
        writer.close();
    }
}
