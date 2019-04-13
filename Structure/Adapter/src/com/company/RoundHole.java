package com.company;

public class RoundHole {
    private float radius;

    public RoundHole(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg rad) {
        return this.getRadius() >= rad.getRadius();
    }
}
