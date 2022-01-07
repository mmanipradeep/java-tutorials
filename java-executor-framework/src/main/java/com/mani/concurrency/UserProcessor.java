package com.mani.concurrency;

import java.util.concurrent.Callable;

public class UserProcessor implements Callable<Integer> {

    private String userRecord;
    private UserDao userDao;

    public UserProcessor(String userRecord, UserDao userDao) {
        this.userRecord = userRecord;
        this.userDao = userDao;
    }

    @Override
    public Integer call() throws Exception {
        return null;


        //call saveUser method to store in DB
    }
}
