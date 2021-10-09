package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.PlainTime;

public class PlainTimeUtils {
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
        boolean result = false;
        if ((incomingYear % 400 == 0 || incomingYear % 4 == 0) && (incomingYear % 100 != 0)) {
            result = true;
        }
        return result;
    }

    /*
     * 6. Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.
     * */

    public static PlainTime convertSeconds(long secondsAfter) {
        long resultHours = secondsAfter / 3600;
        long resultMinutes = (secondsAfter - resultHours * 3600) / 60;
        long resultSeconds = (secondsAfter - resultHours * 3600 - resultMinutes * 60);

        PlainTime currentTime = new PlainTime(resultHours, resultMinutes, resultSeconds);
        return currentTime;
    }
}
