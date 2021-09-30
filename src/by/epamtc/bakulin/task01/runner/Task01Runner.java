package by.epamtc.bakulin.task01.runner;

import by.epamtc.bakulin.task01.entity.PlainPoint;
import by.epamtc.bakulin.task01.entity.PlainTime;
import by.epamtc.bakulin.task01.service.*;
import by.epamtc.bakulin.task01.view.AbstractConsoleInput;

public class Task01Runner extends AbstractConsoleInput {

    public static void main(String[] args) {
//        runTask01_1();
//
//        runTask01_2();
//
//        runTask01_3();
//
//        runTask01_4();
//
//        runTask01_5();

//        runTask01_6();

        runTask01_7();

        close();

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
        int userYear = enterInteger("year");
        int userMonth = enterInteger("month");
        int result = CalculateDaysAtLeapYearMonth.calculateDaysAtLeapYearMonth(userYear, userMonth);
        printConsoleMessage(String.format("Task 2: result = %d \n", result));
    }

    public static void runTask01_3() {
        printConsoleMessage("Task 3: Started...");
        printConsoleMessage("Enter numeric double outer rectangular square, to calculate rectangle inscribed in a circle, which inscribed in first rectangular");
        double userOuterRectangleSquare = enterDouble("outer rectangle square");
        double innerRectangleSquare = CalculateRectangleSquareInscribedInCircle.calculateRectangleSquareInCircle(userOuterRectangleSquare);
        printConsoleMessage(String.format("Task 3: result = %.3f \n", innerRectangleSquare));
    }

    public static void runTask01_4() {
        printConsoleMessage("Task 4: Started...");
        printConsoleMessage("Enter 4 integer values and check - are there at list 2 or more even values. True - has 2 and more even values.");
        int[] userIntegerArray = populateIntegerArray(4);
        boolean isHasTwoEvenNumbers = IsIntegerArrayHasTwoEvenNumerics.isIntegerArrayHasTwoEvenNumerics(userIntegerArray);
        printConsoleMessage(String.format("Task 4: result = %b \n", isHasTwoEvenNumbers));
    }

    public static void runTask01_5() {
        printConsoleMessage("Task 5: Started...");
        printConsoleMessage("Enter 1 integer value to check it: does it belongs to perfect set of numbers; True - positive result, False - negative result;");
        int userValue = enterInteger("userValue");
        boolean isPerfect = IsIntegerNumericPerfect.isIntegerNumericPerfect(userValue);
        printConsoleMessage(String.format("Task 5: result = %b \n", isPerfect));
    }

    public static void runTask01_6() {
        printConsoleMessage("Task 6: Started...");
        printConsoleMessage("Enter 1 long value of seconds to convert it to HH:MM:SS format, where HH - hours, MM - minutes, SS - seconds");
        long userValue = enterLong("userValue");
        PlainTime time = CalculateCurrentTime.convertSeconds(userValue);
        printConsoleMessage(String.format("Task 6: result HH:MM:SS = %s \n", time.toString()));
    }

    public static void runTask01_7() {
        printConsoleMessage("Task 7: Started...");
        PlainPoint centerPoint = new PlainPoint("O", 0, 0);
        printConsoleMessage(String.format("Enter coordinates A(x1; y1) B(x2; y2) to find out which point is closer to center of coordinates %s", centerPoint));


        printConsoleMessage("Enter point A(x1;y1) coordinates:");
        double xA = enterDouble("x(A)");
        double yA = enterDouble("y(A)");
        PlainPoint pointA = new PlainPoint("A", xA, yA);
        printConsoleMessage(String.format("Point: %s \n", pointA));

        printConsoleMessage("Enter point B(x2;y2) coordinates:");
        double xB = enterDouble("x(B)");
        double yB = enterDouble("y(B)");
        PlainPoint pointB = new PlainPoint("A", xB, yB);
        printConsoleMessage(String.format("Point: %s \n", pointB));

        PlainPoint resultPoint = ComparePointsLocation.comparePointsToCenter(centerPoint, pointA, pointB);

        printConsoleMessage(String.format("Task 7 result: %s closer to center %s \n", resultPoint, centerPoint));
    }

}
