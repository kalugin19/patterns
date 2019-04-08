package com.company;

import java.util.Objects;

public class Rectangle extends Shape {

    public int width;
    public int height;


    public Rectangle() {
    }

    public Rectangle(Rectangle shape) {
        super(shape);
        if (shape!=null){
            height = shape.height;
            width = shape.width;
        }

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
