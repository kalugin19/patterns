package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(12);
        circle.setColor("red");
        circle.setX(23);
        circle.setY(3);

        System.out.println(circle.toString());

        Circle circle1 = (Circle) circle.clone();

        System.out.println(circle1.toString());
        circle1.setColor("green");

        System.out.println(circle1.toString());
        System.out.println(circle.toString());

    }
}
