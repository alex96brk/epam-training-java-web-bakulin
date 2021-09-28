package by.epamtc.bakulin.task01.service;

public class IsIntegerNumericPerfect {
    /*
     * Задача:
     * 5. Составить программу, печатающую значение true, если указанное высказывание является истинным,
     *  и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
     * */


    public static boolean isIntegerNumericPerfect(int incomingValue) {
        int sum = 0;
        boolean isPerfect = false;

        for (int i = 1; i < incomingValue; i++) {
            if (incomingValue % i == 0) {
                sum += i;
            }
        }
        if(sum == incomingValue) {
            isPerfect = true;
        }
        return isPerfect;
    }
}

/*
*    private int incomingValue;

    public IsIntegerNumericPerfect(int incomingValue) {
        this.incomingValue = incomingValue;
    }

    public boolean calculate() {
        int sum = 0;
        int value = this.incomingValue;

        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }

        if(sum == this.incomingValue) {
            return true;
        }
        return false;
    }
* */
