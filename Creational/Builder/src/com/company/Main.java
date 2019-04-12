package com.company;

class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Pizza margarita = director.constructMargherita().build();
        Pizza neapolitano = director.constructNeapolitano().build();

        System.out.println(margarita.toString()+"\n");
        System.out.println(neapolitano.toString());
    }
}
