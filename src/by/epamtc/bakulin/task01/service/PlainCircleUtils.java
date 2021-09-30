package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.Circle;
import by.epamtc.bakulin.task01.entity.Rectangular;

public class PlainCircleUtils {

    /*
     * Задача:
     * 3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
     *  Во сколько раз площадь вписанного квадрата меньше площади заданного?
     * */

    /*
     * Задача:
     * 9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
     * */

    public static double calculateRectangleSquareInCircle(double outerRectangularSquareValue) {
        Rectangular outerRectangle = new Rectangular(outerRectangularSquareValue);
        double outerRectangleSide = outerRectangle.getRectangularSide();

        Circle innerCircle = new Circle(Circle.calculateCircleSquare(outerRectangleSide));
        double innerCircleDiameter = innerCircle.getCircleDiameter();

        double innerRectangleSide = innerCircleDiameter / Math.sqrt(2);
        Rectangular innerRectangular = new Rectangular(Rectangular.calculateRectangleSquare(innerRectangleSide));

        return innerRectangular.getRectangularSquare();
    }

    public static double calculateCircleSquare(double circleRadius) {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    public static double calculateСircumference(double circleRadius) {
        return 2 * Math.PI * circleRadius;
    }


}