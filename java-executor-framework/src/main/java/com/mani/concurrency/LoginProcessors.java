package com.mani.concurrency;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginProcessors implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        Logger.getLogger(LoginProcessors.class.getName()).log(Level.INFO,"Loggin something");
        return true;
    }
}
