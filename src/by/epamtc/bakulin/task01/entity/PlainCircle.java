package by.epamtc.bakulin.task01.entity;

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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        PlainCircle circle = (PlainCircle) obj;
        return circle.circleSquare == circleSquare;
    }

    @Override
    public int hashCode() {
        int result = 1;

        long circleSquareAsLong = Double.doubleToLongBits(circleSquare);
        result = 31 * result + (int)(circleSquareAsLong ^ (circleSquareAsLong >>> 32));
        return result;
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
