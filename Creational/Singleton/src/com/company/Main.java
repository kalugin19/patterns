package com.company;

import com.company.static_field.Singleton;

public class Main {

    public static void main(String[] args) {
        com.company.static_field.Singleton singleton1 = Singleton.INSTANCE;
        com.company.static_field.Singleton singleton11 = Singleton.INSTANCE;
        System.out.println(singleton1);
        System.out.println(singleton11);


        com.company.lazy_singleton_synchronized.Singleton singleton2 = com.company.lazy_singleton_synchronized.Singleton.getInstance();
        com.company.lazy_singleton_synchronized.Singleton singleton22 = com.company.lazy_singleton_synchronized.Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton22);

        com.company.lazy_singleton_volitile.Singleton singleton3 = com.company.lazy_singleton_volitile.Singleton.getInstance();
        com.company.lazy_singleton_volitile.Singleton singleton33 = com.company.lazy_singleton_volitile.Singleton.getInstance();

        System.out.println(singleton3);
        System.out.println(singleton33);

    }
}
