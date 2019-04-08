package com.company.lazy_singleton_synchronized;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
