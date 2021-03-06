package com.mani.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.mani.grpc.Category;
import com.mani.grpc.ECommerceServiceGrpc;
import com.mani.grpc.OrderRequest;

public class ServerStreamingTest {

    private ManagedChannel channel;
    private ECommerceServiceGrpc.ECommerceServiceStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        this.clientStub = ECommerceServiceGrpc.newStub(channel);
    }

    @Test
    public void bookStreamingTest() throws InterruptedException {
        OrderRequest ebook = OrderRequest.newBuilder().setOrderCategory(Category.EBOOKS).build();
        this.clientStub.placeOrder(ebook, new OrderResponseStreamObserver());


        // just for testing
        Thread.sleep(10000);
    }

    @Test
    public void electronicStreamingTest() throws InterruptedException {
        OrderRequest electronic = OrderRequest.newBuilder().setOrderCategory(Category.ELECTRONICS).build();
        this.clientStub.placeOrder(electronic, new OrderResponseStreamObserver());

        // just for testing
        Thread.sleep(10000);
    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}
