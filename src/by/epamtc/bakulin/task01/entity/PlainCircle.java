package by.epamtc.bakulin.task01.entity;

import java.util.Objects;

public class PlainCircle {

    private double circleSquare;

    public PlainCircle(double circleSquare) {
        this.circleSquare = circleSquare;
    }

    public PlainCircle() {}

    public double getCircleSquare() {
        return circleSquare;
    }

    public void setCircleSquare(double circleSquare) {
        this.circleSquare = circleSquare;
    }

    @Override
    public String toString() {
        return String.format("PlainCircle{ circleSquare = %f.3}", circleSquare);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlainCircle)) return false;
        PlainCircle circle = (PlainCircle) o;
        return Double.compare(circle.circleSquare, circleSquare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(circleSquare);
    }

    public static double calculateCircleSquare( double circleDiameter) {
        double circleSquare = (Math.PI * Math.pow(circleDiameter, 2) / 4);
        return circleSquare;
    }

    public double calculateCircleDiameter() {
        double circleDiameter = Math.sqrt((4 * this.circleSquare) / Math.PI);
        return circleDiameter;
    }


}