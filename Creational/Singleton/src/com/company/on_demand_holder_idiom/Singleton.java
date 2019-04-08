package com.company.on_demand_holder_idiom;

public class Singleton {

    private Singleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }
}
