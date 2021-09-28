package by.epamtc.bakulin.task01.service;

public class CalculateDaysAtLeapYearMonth {

    /*
     * Задача:
     * 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце
     *    и корректно определялись все високосные года.
     * */

    private static final int[] plainMonthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] leapMonthArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int calculateDaysAtLeapYearMonth(int year, int month) {
        int result = plainMonthArray[month - 1];

        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            result = leapMonthArray[month - 1];
        }
        return result;
    }

    private static boolean isLeapYear(int incomingYear) {
        if ((incomingYear % 400 == 0 || incomingYear % 4 == 0) && (incomingYear % 100 != 0)) {
            return true;
        }
        return false;
    }


}

