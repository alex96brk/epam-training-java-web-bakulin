package by.epamtc.bakulin.task01.entity;

import java.util.Objects;

public class PlainTime {
    private long hours;
    private long minutes;
    private long seconds;

    public PlainTime(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public PlainTime() {}

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("PlainTime{ hours = %d; minutes = %d; seconds = %d}", hours, minutes, seconds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        PlainTime plainDate = (PlainTime) obj;
        return plainDate.hours == hours && plainDate.minutes == minutes && plainDate.seconds == seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }
}
