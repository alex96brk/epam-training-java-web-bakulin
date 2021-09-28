package implementation;

public class Task01_5 {
    /*
     * 5. Составить программу, печатающую значение true, если указанное высказывание является истинным,
     *  и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
     * */

    private int incomingValue;

    public Task01_5(int incomingValue) {
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


}
