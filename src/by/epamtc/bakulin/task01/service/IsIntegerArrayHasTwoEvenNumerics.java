package by.epamtc.bakulin.task01.service;

public class IsIntegerArrayHasTwoEvenNumerics {

    /*
     * Задача:
     * 4. Составить программу, печатающую значение true, если указанное высказывание является истинным,
     *  и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
     * */

    public static boolean isIntegerArrayHasTwoEvenNumerics(int[] values) {
        int evenCounter = 0;
        boolean result = false;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenCounter++;
            }
        }

        if (evenCounter >= 2) {
            result = true;
        }
        return result;
    }
}
