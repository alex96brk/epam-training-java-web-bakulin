package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.view.AbstractConsoleInput;

public class PlainFunction {
    /*
    * Задача 8
    *
    * */

    public static double calculatePlainFunction(double incomingValue) {
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
    * Задача 10
    * */

    public static double[] calculateTanArguments(double[] argumentsRadians) {
        double[] functionValues = new double[argumentsRadians.length];
        for(int i = 0; i < argumentsRadians.length; i++) {
            functionValues[i] = Math.tan(argumentsRadians[i]);
        }
        return functionValues;
    }

}
