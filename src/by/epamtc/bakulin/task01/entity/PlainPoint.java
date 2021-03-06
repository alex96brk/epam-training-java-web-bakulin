package by.epamtc.bakulin.task01.entity;

public class PlainPoint {

    private String name;
    private double x;
    private double y;

    public PlainPoint(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public PlainPoint() {}

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("PlainPoint{ name = %s; x = %.1f; y = %.1f) }", name, x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        PlainPoint point = (PlainPoint) obj;
        return point.x == x && point.y == y && (point.name == name || (name!= null && name.equals(point.name)) );
    }

    @Override
    public int hashCode() {
        int result = 1;

        long xAsLong = Double.doubleToLongBits(x);
        long yAsLong = Double.doubleToLongBits(y);

        result = 31 * result + (int) (xAsLong ^ (xAsLong >>> 32));
        result = 31 * result + (int) (yAsLong ^ (yAsLong >>> 32));
        result = 31 * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }

}
