package by.epamtc.bakulin.task01.test;

import by.epamtc.bakulin.task01.entity.PlainPoint;
import by.epamtc.bakulin.task01.entity.PlainTime;
import by.epamtc.bakulin.task01.service.PlainFunctionUtils;
import by.epamtc.bakulin.task01.service.PlainGeometryUtils;
import by.epamtc.bakulin.task01.service.PlainMathUtils;
import by.epamtc.bakulin.task01.service.PlainTimeUtils;
import by.epamtc.bakulin.view.AbstractConsoleInput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task01Test extends AbstractConsoleInput {

    @Test
    public void runTask01_task1_test1() {
        printConsoleMessage("Task 1: Started... test1");
        printConsoleMessage("Enter numeric integer value, to calculate square of its last digit.");
        int userValue = 10;
        int result = PlainMathUtils.calculateLastNumberSquareValue(userValue);
        printConsoleMessage(String.format("Task 1: result = %d \n", result));
    }

    @Test
    public void runTask01_task2_test1() {
        printConsoleMessage("Task 2: Started... test1");
        printConsoleMessage("Enter a numeric integer year and month, to calculate days quantity");
        int userYear = 1996;
        int userMonth = 2;
        int result = PlainTimeUtils.calculateDaysAtLeapYearMonth(userYear, userMonth);
        printConsoleMessage(String.format("Task 2: result = %d \n", result));
    }

    @Test
    public void runTask01_task3_test1() {
        printConsoleMessage("Task 3: Started... test1");
        printConsoleMessage("Enter numeric double outer rectangular square, to calculate rectangle inscribed in a circle, which inscribed in first rectangular");
        double userOuterRectangleSquare = 100;
        double innerRectangleSquare = PlainGeometryUtils.calculateRectangleSquareInCircle(userOuterRectangleSquare);
        printConsoleMessage(String.format("Task 3: result = %.3f \n", innerRectangleSquare));
    }

    @Test
    public void runTask01_task4_test1() {
        printConsoleMessage("Task 4: Started... test1");
        printConsoleMessage("Enter 4 integer values and check - are there at list 2 or more even values. True - has 2 and more even values.");
        int[] userIntegerArray = {1,2,3,4};
        printConsoleMessage(String.format("array: %s", Arrays.toString(userIntegerArray)));
        boolean isHasTwoEvenNumbers = PlainMathUtils.isIntegerArrayHasTwoEvenNumerics(userIntegerArray);
        printConsoleMessage(String.format("Task 4: result = %b \n", isHasTwoEvenNumbers));
    }

    @Test
    public void runTask01_task5_test1() {
        printConsoleMessage("Task 5: Started... test1");
        printConsoleMessage("Enter 1 integer value to check it: does it belongs to perfect set of numbers; True - positive result, False - negative result;");
        int userValue = 6;
        printConsoleMessage(String.format("input = %d", userValue));
        boolean isPerfect = PlainMathUtils.isIntegerNumericPerfect(userValue);
        printConsoleMessage(String.format("Task 5: result = %b \n", isPerfect));
    }

    @Test
    public void runTask01_task6_test1() {
        printConsoleMessage("Task 6: Started... test1");
        printConsoleMessage("Enter 1 long value of seconds to convert it to HH:MM:SS format, where HH - hours, MM - minutes, SS - seconds");
        long userValue = 3601;
        printConsoleMessage(String.format("input = %d", userValue));
        PlainTime time = PlainTimeUtils.convertSeconds(userValue);
        printConsoleMessage(String.format("Task 6: result HH:MM:SS = %s \n", time.toString()));
    }

    @Test
    public void runTask01_task7_test1() {
        printConsoleMessage("Task 7: Started... test1");
        PlainPoint centerPoint = new PlainPoint("O", 0, 0);
        printConsoleMessage(String.format("Enter coordinates A(x1; y1) B(x2; y2) to find out which point is closer to center of coordinates %s", centerPoint));


        printConsoleMessage("Enter point A(x1;y1) coordinates:");
        double xA = 3.4;
        double yA = 2.5;
        PlainPoint pointA = new PlainPoint("A", xA, yA);
        printConsoleMessage(String.format("Point: %s \n", pointA));

        printConsoleMessage("Enter point B(x2;y2) coordinates:");
        double xB = 2.1;
        double yB = 3.6;
        PlainPoint pointB = new PlainPoint("A", xB, yB);
        printConsoleMessage(String.format("Point: %s \n", pointB));

        PlainPoint resultPoint = PlainMathUtils.comparePointsToCenter(centerPoint, pointA, pointB);

        printConsoleMessage(String.format("Task 7 result: %s closer to center %s \n", resultPoint, centerPoint));
    }

    @Test
    public void runTask01_task8_test1() {
        printConsoleMessage("Task 8: Started... test1");
        printConsoleMessage("Enter 1 value to calculate function: \nif value >= 3 -> f(value) = -x^2 + 3x + 9 \nif value < 3 -> 1 / (x^3 -6)");
        double userValue = 3;
        printConsoleMessage(String.format("input = %.3f", userValue));
        double result = PlainFunctionUtils.calculateAlgebraPlainFunction(userValue);
        printConsoleMessage(String.format("Task 8: f(%.3f) = %.3f \n", userValue, result));
    }

    @Test
    public void runTask01_task9_test1() {
        printConsoleMessage("Task 8: Started... test1");
        printConsoleMessage("Enter circle radius to calculate its square and circumference");
        double radius = 9;
        printConsoleMessage(String.format("input = %.3f", radius));
        double circleSquare = PlainGeometryUtils.calculateCircleSquare(radius);
        double circleCircumference = PlainGeometryUtils.calculateСircumference(radius);
        printConsoleMessage(String.format("Task 8: \nsquare = %.3f \ncircumference = %.3f \n", circleSquare, circleCircumference));
    }

    @Test
    public void runTask01_task10_test1() {
        printConsoleMessage("Task 10: Started... test1");
        printConsoleMessage("Enter left and right border values and step(Radians) of populated array, to calculate fucntion f(x) = tg(x) on range");
        double a = 2.1;
        double b = 5.5;
        double step = 0.1;
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
