package by.epamtc.bakulin.task01.service;

import by.epamtc.bakulin.task01.entity.PlainTime;

public class CalculateCurrentTime {
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
