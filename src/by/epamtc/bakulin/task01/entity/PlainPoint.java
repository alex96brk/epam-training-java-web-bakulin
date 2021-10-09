package by.epamtc.bakulin.task01.entity;

import by.epamtc.bakulin.task02.entity.PlainBall;

import java.util.Objects;

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
        return String.format("%s(%.1f ; %.1f)", name, x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlainPoint)) return false;
        PlainPoint that = (PlainPoint) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
