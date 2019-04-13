package com.company;

public class SquareAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquareAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public SquarePeg getSquarePeg() {
        return squarePeg;
    }

    public void setSquarePeg(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public float getRadius() {
        float result;
        // Рассчитываем минимальный радиус, в который пролезет этот колышек.
        result = (float) Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
        return result;
    }


}
