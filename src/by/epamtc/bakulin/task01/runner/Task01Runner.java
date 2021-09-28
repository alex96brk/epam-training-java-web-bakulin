package by.epamtc.bakulin.task01.runner;

import by.epamtc.bakulin.task01.service.*;
import by.epamtc.bakulin.task01.view.AbstractConsoleInput;

public class Task01Runner extends AbstractConsoleInput {

    public static void main(String[] args) {
        runTask01_1();

        runTask01_2();

        runTask01_3();

        runTask01_4();

        runTask01_5();
    }

    public static void runTask01_1() {
        printConsoleMessage("Task 1: Started...");
        printConsoleMessage("Enter numeric integer value, to calculate square of its last digit.");
        int userValue = enterInteger("userValue");
        int result = CalculateLastNumberSquareValue.calculateLastNumSquareValue(userValue);
        printConsoleMessage(String.format("Task 1: result = %d \n", result));
    }

    public static void runTask01_2() {
        printConsoleMessage("Task 2: Started...");
        printConsoleMessage("Enter a numeric integer year and month, to calculate days quantity");
        int year = enterInteger("year");
        int month = enterInteger("month");
        int result = CalculateDaysAtLeapYearMonth.calculateDaysAtLeapYearMonth(year, month);
        printConsoleMessage(String.format("Task 2: result = %d \n", result));
    }

    public static void runTask01_3() {
        printConsoleMessage("Task 3: Started...");
        printConsoleMessage("Enter numeric double outer rectangular square, to calculate rectangle inscribed in a circle, which inscribed in first rectangular");
        double outerRectangleSquare = enterDouble("outer rectangle square");
        double innerRectangleSquare = CalculateRectangleSquareInscribedInCircle.calculateRectangleSquareInCircle(outerRectangleSquare);
        printConsoleMessage(String.format("Task 3: result = %.3f \n", innerRectangleSquare));
    }

    public static void runTask01_4() {
        printConsoleMessage("Task 4: Started...");
        printConsoleMessage("Enter 4 integer values and check - are there at list 2 or more even values. True - has 2 and more even values.");
        int[] intArray = populateIntegerArray(4);
        boolean isHasTwoEvenNumbers = IsIntegerArrayHasTwoEvenNumerics.isIntegerArrayHasTwoEvenNumerics(intArray);
        printConsoleMessage(String.format("Task 4: result = %b \n", isHasTwoEvenNumbers));
    }

    public static void runTask01_5() {
        printConsoleMessage("Task 5: Started...");
        printConsoleMessage("Enter 1 integer value to check it: does it belongs to perfect set of numbers; True - positive result, False - negative result;");
        int userValue = enterInteger("userValue");
        boolean isPerfect = IsIntegerNumericPerfect.isIntegerNumericPerfect(userValue);
        printConsoleMessage(String.format("Task 5: result = %b \n", isPerfect));
    }

}
