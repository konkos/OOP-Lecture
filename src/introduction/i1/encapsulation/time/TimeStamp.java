package introduction.i1.encapsulation.time;

public class TimeStamp {

    private final int second;
    private final int minute;
    private int hour;

    public TimeStamp(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public void increaseHour() {
        hour++;
        if (hour == 24)
            hour = 0;
    }

    public void printTime() {
        System.out.println("Time is: " + hour + ":" +
                minute + ":" + second);
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
