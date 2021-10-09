package by.epamtc.bakulin.task01.runner;

import by.epamtc.bakulin.task01.entity.PlainPoint;
import by.epamtc.bakulin.task01.entity.PlainTime;
import by.epamtc.bakulin.task01.service.PlainFunctionUtils;
import by.epamtc.bakulin.task01.service.PlainGeometryUtils;
import by.epamtc.bakulin.task01.service.PlainMathUtils;
import by.epamtc.bakulin.task01.service.PlainTimeUtils;
import by.epamtc.bakulin.view.AbstractConsoleInput;

public class Task01Runner extends AbstractConsoleInput {

    public static void main(String[] args) {
        runTask01_task1();

        runTask01_task2();

        runTask01_task3();

        runTask01_task4();

        runTask01_task5();

        runTask01_task6();

        runTask01_task7();

        runTask01_task8();

        runTask01_task9();

        runTask01_task10();

        close();
    }
     
    public static void runTask01_task1() {
        printConsoleMessage("Task 1: Started...");
        printConsoleMessage("Enter numeric integer value, to calculate square of its last digit.");
        int userValue = enterInteger("userValue");
        int result = PlainMathUtils.calculateLastNumberSquareValue(userValue);
        printConsoleMessage(String.format("Task 1: result = %d \n", result));
    }

    public static void runTask01_task2() {
        printConsoleMessage("Task 2: Started...");
        printConsoleMessage("Enter a numeric integer year and month, to calculate days quantity");
        int userYear = enterInteger("year");
        int userMonth = enterInteger("month");
        int result = PlainTimeUtils.calculateDaysAtLeapYearMonth(userYear, userMonth);
        printConsoleMessage(String.format("Task 2: result = %d \n", result));
    }

    public static void runTask01_task3() {
        printConsoleMessage("Task 3: Started...");
        printConsoleMessage("Enter numeric double outer rectangular square, to calculate rectangle inscribed in a circle, which inscribed in first rectangular");
        double userOuterRectangleSquare = enterDouble("outer rectangle square");
        double innerRectangleSquare = PlainGeometryUtils.calculateRectangleSquareInCircle(userOuterRectangleSquare);
        printConsoleMessage(String.format("Task 3: result = %.3f \n", innerRectangleSquare));
    }

    public static void runTask01_task4() {
        printConsoleMessage("Task 4: Started...");
        printConsoleMessage("Enter 4 integer values and check - are there at list 2 or more even values. True - has 2 and more even values.");
        int[] userIntegerArray = populateIntegerArray(4);
        boolean isHasTwoEvenNumbers = PlainMathUtils.isIntegerArrayHasTwoEvenNumerics(userIntegerArray);
        printConsoleMessage(String.format("Task 4: result = %b \n", isHasTwoEvenNumbers));
    }

     
    public static void runTask01_task5() {
        printConsoleMessage("Task 5: Started...");
        printConsoleMessage("Enter 1 integer value to check it: does it belongs to perfect set of numbers; True - positive result, False - negative result;");
        int userValue = enterInteger("userValue");
        boolean isPerfect = PlainMathUtils.isIntegerNumericPerfect(userValue);
        printConsoleMessage(String.format("Task 5: result = %b \n", isPerfect));
    }

    public static void runTask01_task6() {
        printConsoleMessage("Task 6: Started...");
        printConsoleMessage("Enter 1 long value of seconds to convert it to HH:MM:SS format, where HH - hours, MM - minutes, SS - seconds");
        long userValue = enterLong("userValue");
        PlainTime time = PlainTimeUtils.convertSeconds(userValue);
        printConsoleMessage(String.format("Task 6: result HH:MM:SS = %s \n", time.toString()));
    }

    public static void runTask01_task7() {
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

        PlainPoint resultPoint = PlainMathUtils.comparePointsToCenter(centerPoint, pointA, pointB);

        printConsoleMessage(String.format("Task 7 result: %s closer to center %s \n", resultPoint, centerPoint));
    }

    public static void runTask01_task8() {
        printConsoleMessage("Task 8: Started...");
        printConsoleMessage("Enter 1 value to calculate function: \nif value >= 3 -> f(value) = -x^2 + 3x + 9 \nif value < 3 -> 1 / (x^3 -6)");
        double userValue = enterDouble("userValue");
        double result = PlainFunctionUtils.calculateAlgebraPlainFunction(userValue);
        printConsoleMessage(String.format("Task 8: f(%.3f) = %.3f \n", userValue, result));
    }

    public static void runTask01_task9() {
        printConsoleMessage("Task 8: Started...");
        printConsoleMessage("Enter circle radius to calculate its square and circumference");
        double radius = enterDouble("radius");
        double circleSquare = PlainGeometryUtils.calculateCircleSquare(radius);
        double circleCircumference = PlainGeometryUtils.calculateСircumference(radius);
        printConsoleMessage(String.format("Task 8: \nsquare = %.3f \ncircumference = %.3f \n", circleSquare, circleCircumference));
    }
    
    public static void runTask01_task10() {
        printConsoleMessage("Task 10: Started...");
        printConsoleMessage("Enter left and right border values and step(Radians) of populated array, to calculate fucntion f(x) = tg(x) on range");
        double a = enterDouble("a");
        double b = enterDouble("b");
        double step = enterDouble("step");
        double[] argumentsInRadians = populateDoubleArrayInRange(a,b,step);
        double[] functionResults = PlainFunctionUtils.calculateTrigonometricPlainFunction(argumentsInRadians);
        printTask10Array(argumentsInRadians, functionResults);
        printConsoleMessage("Task 10: finished");
    }

    private static void printTask10Array(double[] arguments, double[] function) {
        printConsoleMessage("Result Table:");
        printConsoleMessage("\t  x          f(x)");
        for (int i = 0; i < arguments.length; i++) {
            printConsoleMessage(String.format("\t %.1f        %.3f", arguments[i], function[i]));
        }
    }
}
