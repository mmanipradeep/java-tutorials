package com.java.FileReading;

import com.sun.net.httpserver.HttpsServer;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;
import org.springframework.web.server.ResponseStatusException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReadingTest {



    @Rule
    public TestName name = new TestName();


    @Test
    public void whenReadWithFileChannel_thenCorrect()
            throws IOException {
        System.out.println("displayName="+name.getMethodName());
        String expected_value = "Hello, world!";
        String file = "src/test/resources/fileTest.txt";
        RandomAccessFile reader = new RandomAccessFile(file, "r");
        FileChannel channel = reader.getChannel();

        int bufferSize = 1024;
        if (bufferSize > channel.size()) {
            bufferSize = (int) channel.size();
        }
        ByteBuffer buff = ByteBuffer.allocate(bufferSize);
        channel.read(buff);
        buff.flip();

        assertEquals(expected_value, new String(buff.array()));
        channel.close();
        reader.close();
    }
}
