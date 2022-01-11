package com.mani.pradeep.creational.singleton;

public class DoubleCheckLockedSingleton {
    /*
    We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly
     when it is being initialized to Singleton instance.
    This method drastically reduces the overhead of calling the synchronized method every time.
     */
    private static volatile DoubleCheckLockedSingleton obj  = null;

    private DoubleCheckLockedSingleton() {}

    public static DoubleCheckLockedSingleton getInstance()
    {
        if (obj == null) {
            // To make thread safe
            synchronized (DoubleCheckLockedSingleton.class) {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new DoubleCheckLockedSingleton();
            }
        }
        return obj;
    }
}
