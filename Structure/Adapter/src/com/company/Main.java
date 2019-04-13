package com.company;

public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10f);
        RoundPeg roundPeg1 = new RoundPeg(11f);
        RoundPeg roundPeg2 = new RoundPeg(8f);

        System.out.println("Round peg 1 fits? : "+roundHole.fits(roundPeg1));
        System.out.println("Round peg 2 firts?: "+roundHole.fits(roundPeg2));

        SquarePeg squarePeg1 = new SquarePeg(33f);
        SquarePeg squarePeg2 = new SquarePeg(13f);
        SquarePeg squarePeg3 = new SquarePeg(2f);

        SquareAdapter squareAdapter1 = new SquareAdapter(squarePeg1);
        System.out.println("Square peg 1 fits? : "+roundHole.fits(squareAdapter1));

        SquareAdapter squareAdapter2 = new SquareAdapter(squarePeg2);
        System.out.println("Square peg 2 fits? : "+roundHole.fits(squareAdapter2));

        SquareAdapter squareAdapter3 = new SquareAdapter(squarePeg3);
        System.out.println("Square peg 3 fits? : "+roundHole.fits(squareAdapter3));
    }
}
