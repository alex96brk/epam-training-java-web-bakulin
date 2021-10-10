package by.epamtc.bakulin.task01.entity;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        PlainRectangular rectangular = (PlainRectangular) obj;
        return rectangular.rectangularSquare == rectangularSquare;
    }

    @Override
    public int hashCode() {
        int result = 1;

        long rectangularSquareAsLong = Double.doubleToLongBits(rectangularSquare);
        result = 31 * result + (int)(rectangularSquareAsLong ^ (rectangularSquareAsLong >>> 32));
        return result;
    }


}
