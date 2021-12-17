package com.mani.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AmazonServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        // build gRPC server
        Server server = ServerBuilder.forPort(6565)
                .addService(new AmazonOnlineService())
                .build();
        System.out.println("Amazon server is starting!");
        // start
        server.start();

        // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Amazon server is shutting down!");
            server.shutdown();
        }));

        server.awaitTermination();

    }

}
