package implementation;

import abstraction.AbstractConsoleInput;

/*
*   Задача:
*   1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
* */

public class Task01_1 {

    private int userValue;

    public Task01_1(int userValue) {
        this.userValue = userValue;
    }

    public int calculate() {
        char[] strCharArray = Integer.toString(this.userValue).toCharArray();
        int lastValue = Character.getNumericValue(strCharArray[strCharArray.length - 1]);
        int result = lastValue * lastValue;
        return result;
    }
}
