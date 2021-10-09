package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.PlainPoint;

public class PlainMathUtils {
    /*
     * Задача:
     * 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
     * */

    public static int calculateLastNumberSquareValue(int incomingValue) {
        int result = incomingValue % 10;
        return result * result;
    }

    /*
     * Задача:
     * 4. Составить программу, печатающую значение true, если указанное высказывание является истинным,
     *  и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
     * */

    public static boolean isIntegerArrayHasTwoEvenNumerics(int...values) {
        int evenCounter = 0;
        boolean result = false;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenCounter++;
            }
        }

        if (evenCounter >= 2) {
            result = true;
        }
        return result;
    }

    /*
     * Задача:
     * 5. Составить программу, печатающую значение true, если указанное высказывание является истинным,
     *  и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
     * */

    public static boolean isIntegerNumericPerfect(int incomingValue) {
        int sum = 0;
        boolean isPerfect = false;

        for (int i = 1; i < incomingValue; i++) {
            if (incomingValue % i == 0) {
                sum += i;
            }
        }
        if(sum == incomingValue) {
            isPerfect = true;
        }
        return isPerfect;
    }

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
