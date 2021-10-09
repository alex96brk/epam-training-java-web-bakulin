package by.epamtc.bakulin.task01.entity;

import java.util.Objects;

public class PlainRectangular {

    private double rectangularSquare;

    public PlainRectangular(double rectangularSquare) {
        this.rectangularSquare = rectangularSquare;
    }

    public PlainRectangular() {}

    public double getRectangularSquare() {
        return rectangularSquare;
    }

    public void setRectangularSquare(double rectangularSquare) {
        this.rectangularSquare = rectangularSquare;
    }

    @Override
    public String toString() {
        return String.format("PlainRectangular{rectangularSquare = %.3f}", this.rectangularSquare);
    }

    public double calculateRectangularSide() {
        double rectangularSide = Math.sqrt(this.rectangularSquare);
        return rectangularSide;
    }

    public static double calculateRectangleSquare(double rectangleSide) {
        double rectangleSquare = Math.pow(rectangleSide, 2);
        return rectangleSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlainRectangular)) return false;
        PlainRectangular that = (PlainRectangular) o;
        return Double.compare(that.rectangularSquare, rectangularSquare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangularSquare);
    }


}
