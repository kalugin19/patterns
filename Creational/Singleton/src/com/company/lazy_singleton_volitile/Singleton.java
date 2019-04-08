package com.company.lazy_singleton_volitile;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        Singleton localSingleton = instance;
        if (localSingleton == null) {
            synchronized (Singleton.class) {
                localSingleton = instance;
                if (localSingleton == null) {
                    instance = localSingleton = new Singleton();
                }
            }
        }
        return localSingleton;
    }
}
