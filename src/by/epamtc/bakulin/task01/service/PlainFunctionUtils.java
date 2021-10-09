package by.epamtc.bakulin.task01.service;

public class PlainFunctionUtils {
    /*
    * Задача:
    * 8. Вычислить значение функции:
    *    f(x) = -x^2 +3x + 9, если x >=3;
    *    f(x) = 1 / (x^3 - 6), если x < 3;
    *
    * */

    public static double calculateAlgebraPlainFunction(double incomingValue) {
        double result = incomingValue;
        if(incomingValue >= 3) {
            result = Math.pow(incomingValue,2)*(-1) + 3 * incomingValue + 9;
        }

        if(incomingValue < 3) {
            result = 1 / (Math.pow(incomingValue, 3) - 6);
        }
        return result;
    }

    /*
    * Задача:
    * 10. Вычислить значения функции на отрезке [a;b] с шагом h
    *       f(x) = tg(x);
    * */

    public static double[] calculateTrigonometricPlainFunction(double[] argumentsRadians) {
        double[] functionValues = new double[argumentsRadians.length];
        for(int i = 0; i < argumentsRadians.length; i++) {
            functionValues[i] = Math.tan(argumentsRadians[i]);
        }
        return functionValues;
    }

}
