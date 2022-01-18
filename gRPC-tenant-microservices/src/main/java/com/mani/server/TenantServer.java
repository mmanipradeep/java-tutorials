package com.mani.server;

import com.mani.service.TenantServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TenantServer {
    private static final Logger logger = Logger.getLogger(TenantServer.class.getName());
    private final int port;
    private Server server ;

    public void starServer(){
        int port =50051;
        try {
            server = ServerBuilder.forPort(port)
                    .addService(new TenantServiceImpl())
                    .build()
                    .start();

            Runtime.getRuntime().addShutdownHook(new Thread(){
                @Override
                public void run() {
                    try {
                        TenantServer.this.stopServer();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (IOException exception) {
        logger.log(Level.SEVERE, "Exception occired",exception);
        }
    }

    public void stopServer() throws InterruptedException {
        if(server!=null){
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if(server!=null){
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {

        TenantServer commodityServer = new TenantServer(8980);
        commodityServer.start();
        if (commodityServer.server != null) {
            commodityServer.server.awaitTermination();
        }
    }



    public TenantServer(int port) throws IOException {
        this.port = port;
        server = ServerBuilder.forPort(port)
                .addService(new TenantServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
      // logger.info("Server started, listening on {}", port);
        logger.log(Level.INFO,"Server started @ port "+port, port);
        Runtime.getRuntime()
                .addShutdownHook(new Thread() {
                    @Override
                    public void run() {
                        System.err.println("shutting down server");
                        try {
                            TenantServer.this.stop();
                        } catch (InterruptedException e) {
                            e.printStackTrace(System.err);
                        }
                        System.err.println("server shutted down");
                    }
                });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown()
                    .awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}
