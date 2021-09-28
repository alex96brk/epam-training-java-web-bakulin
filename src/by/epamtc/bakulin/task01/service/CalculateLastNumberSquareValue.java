package by.epamtc.bakulin.task01.service;

public class CalculateLastNumberSquareValue {

    /*
     * Задача:
     * 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
     * */

    public static int calculateLastNumSquareValue(int incomingValue) {
        int result = getLastDigit(incomingValue);
        return result * result;
    }

    private static int getLastDigit(int incomingValue) {
        return incomingValue % 10;
    }
}
