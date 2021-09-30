package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.PlainPoint;
import by.epamtc.bakulin.task01.entity.PlainTime;

public class ComparePointsLocation {

    /*
    * 6. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.
    * */

    public static void main(String[] args) {
        PlainPoint centerPoint = new PlainPoint("O", 0, 0);
        PlainPoint firstPoint = new PlainPoint("A", 3, 1);
        PlainPoint secondPoint = new PlainPoint("B", 1, 3);
        PlainPoint result = comparePointsToCenter(centerPoint, firstPoint, secondPoint);
        System.out.println(result);

    }

    public static PlainPoint comparePointsToCenter(PlainPoint center, PlainPoint firstPoint, PlainPoint secondPoint) {
        PlainPoint result = secondPoint;
        double firstPointToCenterLength = Math.sqrt(Math.pow(center.getX() - firstPoint.getX(), 2) + Math.pow(center.getY() - firstPoint.getY(), 2));
        double secondPointToCenterLength = Math.sqrt(Math.pow(center.getX() - secondPoint.getX(), 2) + Math.pow(center.getY() - secondPoint.getY(), 2));

        if(firstPointToCenterLength < secondPointToCenterLength) {
            result = firstPoint;
        }

        if(firstPointToCenterLength == secondPointToCenterLength) {
            PlainPoint equalPoint = new PlainPoint("Eq", firstPoint.getX(), firstPoint.getY());
            result = equalPoint;
        }
        return result;
    }
}
