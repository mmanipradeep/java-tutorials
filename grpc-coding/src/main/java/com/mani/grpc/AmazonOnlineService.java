package com.mani.grpc;

import com.google.common.util.concurrent.Uninterruptibles;
import io.grpc.stub.StreamObserver;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AmazonOnlineService  extends  ECommerceServiceGrpc.ECommerceServiceImplBase{

    Map<Category, Consumer<StreamObserver<OrderResponse>>> categoryHandler = Map.of(
            Category.ELECTRONICS, this::handleElectronics,
            Category.EBOOKS, this::handleEBooks
    );

    @Override
    public void placeOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        categoryHandler.get(request.getOrderCategory()).accept(responseObserver);
        responseObserver.onCompleted();
    }

    private void handleElectronics(StreamObserver<OrderResponse> responseStreamObserver){
        Stream.of(Status.PAYMENT_RECEIVED, Status.SHIPPED, Status.OUT_FOR_DELIVERY, Status.DELIVERED)
                .map(OrderResponse.newBuilder()::setOrderStatus)
                .map(OrderResponse.Builder::build)
                .peek(i -> Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS))
                .forEach(responseStreamObserver::onNext);
    }

    private void handleEBooks(StreamObserver<OrderResponse> responseStreamObserver){
        Stream.of(Status.PAYMENT_RECEIVED, Status.DELIVERED)
                .map(OrderResponse.newBuilder()::setOrderStatus)
                .map(OrderResponse.Builder::build)
                .forEach(responseStreamObserver::onNext);
    }
}
