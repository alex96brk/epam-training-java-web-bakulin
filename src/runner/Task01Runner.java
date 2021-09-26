package runner;

import abstraction.AbstractConsoleInput;
import implementation.Task01_1;

public class Task01Runner extends AbstractConsoleInput {
    public static void main(String[] args) {

        System.out.println(String.format("Task 1: Started..."));
        System.out.println("Enter numeric integer value, to calculate square of its last digit.");
        int x = enterInteger("x");
        Task01_1 task1 = new Task01_1(x);
        int task1Result = task1.calculate();
        System.out.println(String.format("Task 1: result = %d \n", task1Result));



    }

}
