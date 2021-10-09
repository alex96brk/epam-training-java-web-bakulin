package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.PlainCircle;
import by.epamtc.bakulin.task01.entity.PlainRectangular;

public class PlainGeometryUtils {

    /*
     * Задача:
     * 3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
     *  Во сколько раз площадь вписанного квадрата меньше площади заданного?
     * */

    public static double calculateRectangleSquareInCircle(double outerRectangularSquareValue) {
        PlainRectangular outerRectangle = new PlainRectangular(outerRectangularSquareValue);
        double outerRectangleSide = outerRectangle.calculateRectangularSide();

        PlainCircle innerCircle = new PlainCircle(PlainCircle.calculateCircleSquare(outerRectangleSide));
        double innerCircleDiameter = innerCircle.calculateCircleDiameter();

        double innerRectangleSide = innerCircleDiameter / Math.sqrt(2);
        PlainRectangular innerRectangular = new PlainRectangular(PlainRectangular.calculateRectangleSquare(innerRectangleSide));

        return innerRectangular.getRectangularSquare();
    }

    /*
     * Задача:
     * 9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
     * */

    public static double calculateCircleSquare(double circleRadius) {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    public static double calculateСircumference(double circleRadius) {
        return 2 * Math.PI * circleRadius;
    }


}