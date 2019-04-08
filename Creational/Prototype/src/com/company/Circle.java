package com.company;

import java.util.Objects;

public class Circle  extends Shape{
    public int radius;


    public Circle() {
    }

    public Circle(Circle shape) {
        super(shape);
        if (shape!=null){
            radius = shape.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "\nradius=" + radius +
                "\ncolor="+getColor() +
                "\nx="+getX()+
                "\ny="+getY()+
                '}' ;
    }
}
