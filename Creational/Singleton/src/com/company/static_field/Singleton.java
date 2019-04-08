package com.company.static_field;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
