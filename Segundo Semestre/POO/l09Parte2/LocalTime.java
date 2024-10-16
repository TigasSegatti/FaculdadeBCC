package l09Parte2;

/**
 *
 * @author tsegatti
 */
public class LocalTime {

    private int hour;
    private int minute;
    private int second;

    public LocalTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static LocalTime now() {
        java.time.LocalTime currentTime = java.time.LocalTime.now();
        return new LocalTime(currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static LocalTime of(int hora, int minuto, int segundo) {
        return new LocalTime(hora, minuto, segundo);
    }
}
