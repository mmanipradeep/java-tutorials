package com.mani.pradeep.singleton;

public class SynchronizedSingleton {
    /**
     * using synchronized every time while creating the singleton object is expensive and may decrease the performance of your program. However if
     * performance of getInstance() is not critical for your application this method provides a clean and simple solution.
     */
    private static SynchronizedSingleton obj;

    private SynchronizedSingleton() {}

    // Only one thread can execute this at a time
    public static synchronized SynchronizedSingleton getInstance()
    {
        if (obj==null)
            obj = new SynchronizedSingleton();
        return obj;
    }
}
