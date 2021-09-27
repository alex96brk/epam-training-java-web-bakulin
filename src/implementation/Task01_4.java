package implementation;

/*
 * 4. Составить программу, печатающую значение true, если указанное высказывание является истинным,
 *  и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 *
 * */

public class Task01_4 {

    private int[] values;

    public Task01_4(int[] values) {
        this.values = values;
    }

    public boolean calculate() {
        int evenNumСounter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                evenNumСounter++;
            }
        }
        if (evenNumСounter >= 2) {
            return true;
        }
        return false;
    }
}
