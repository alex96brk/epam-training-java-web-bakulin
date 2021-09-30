package by.epamtc.bakulin.task01.service;

public class PlainFunction {

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
}
