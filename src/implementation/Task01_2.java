package implementation;

import abstraction.AbstractConsoleInput;

public class Task01_2 {

    /*
     * 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце
     *    и корректно определялись все високосные года.
     *
     * */

    private int year;
    private int month;

    private static final int[] plainMonthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] leapMonthArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Task01_2(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int calculate() {
        boolean isLeapYear = isLeapYear(this.year);
        if(isLeapYear) {
            return leapMonthArray[this.month - 1];
        }
        return plainMonthArray[this.month - 1];
    }

    private static boolean isLeapYear(int incomingYear) {
        if ((incomingYear % 400 == 0 || incomingYear % 4 == 0) && (incomingYear % 100 != 0)) {
            return true;
        }
        return false;
    }


}
