package by.epamtc.bakulin.task01.entity;

import java.util.Objects;

public class Rectangular {

    private double rectangularSquare;

    public Rectangular(double rectangularSquare) {
        this.rectangularSquare = rectangularSquare;
    }

    public double getRectangularSide() {
        double rectangularSide = Math.sqrt(this.rectangularSquare);
        return rectangularSide;
    }

    public double getRectangularSquare() {
        return rectangularSquare;
    }

    public static double calculateRectangleSquare(double rectangleSide) {
        double rectangleSquare = Math.pow(rectangleSide, 2);
        return rectangleSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangular)) return false;
        Rectangular that = (Rectangular) o;
        return Double.compare(that.rectangularSquare, rectangularSquare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangularSquare);
    }


}
