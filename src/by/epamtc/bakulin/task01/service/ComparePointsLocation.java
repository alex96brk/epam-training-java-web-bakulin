package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.PlainPoint;

public class ComparePointsLocation {

    /*
    * 7. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.
    * */

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
