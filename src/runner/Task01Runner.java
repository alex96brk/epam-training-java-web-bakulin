package runner;

import abstraction.AbstractConsoleInput;
import implementation.*;

public class Task01Runner extends AbstractConsoleInput {
    public static void main(String[] args) {

        runTask01_1();

        runTask01_2();

        runTask01_3();

        runTask01_4();

        runTask01_5();


    }

    public static void runTask01_1() {
        System.out.println(String.format("Task 1: Started..."));
        System.out.println("Enter numeric integer value, to calculate square of its last digit.");
        int x = enterInteger("x");
        Task01_1 task1 = new Task01_1(x);
        int task1Result = task1.calculate();
        System.out.println(String.format("Task 1: result = %d \n", task1Result));
    }

    public static void runTask01_2() {
        System.out.println(String.format("Task 2: Started..."));
        System.out.println("Enter numeric integer year and month, to calculate days quantity");
        int year = enterInteger("year");
        int month = enterInteger("month");
        Task01_2 task2 = new Task01_2(year, month);
        int task2Result = task2.calculate();
        System.out.println(String.format("Task 2: result = %d \n", task2Result));
    }

    public static void runTask01_3() {
        System.out.println(String.format("Task 3: Started..."));
        System.out.println("Enter numeric double outer rectangular square, to calculate rectangle inscribed in a circle, which inscribed in first rectangular ");
        double outerRectangularSquare = enterDouble("outerRectangularSquare");
        Task01_3 task3 = new Task01_3(outerRectangularSquare);
        double task3Result = task3.calculate();
        System.out.println(String.format("Task 3: result = %.3f \n", task3Result));
    }

    public static void runTask01_4() {
        System.out.println(String.format("Task 4: Started..."));
        System.out.println("Enter 4 integer values and check - are there at list 2 or more even values. True - has 2 and more even values.");
        int size = 4;
        int[] intArray = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            intArray[i] = enterInteger("incoming value");
        }
        Task01_4 task4 = new Task01_4(intArray);
        boolean task4Result = task4.calculate();
        System.out.println(String.format("Task 4: result = %b \n", task4Result));
    }

    public static void runTask01_5() {
        System.out.println(String.format("Task 5: Started..."));
        System.out.println("Enter 1 integer value to check it: does it belongs to perfect set of numbers; True - positive result, False - negative result;");
        int value = enterInteger("value");
        Task01_5 task4 = new Task01_5(value);
        boolean task4Result = task4.calculate();
        System.out.println(String.format("Task 5: result = %b \n", task4Result));
    }


}
