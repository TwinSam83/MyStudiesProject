package Garbage.tms.lesson3;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds){
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds - hours * 3600) / 60;
        this.seconds = totalSeconds - hours * 3600 - minutes * 60;
    }

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int countSeconds(){
        return seconds + minutes * 60 + hours * 3600;
    }

    @Override
    public String toString() {
        return "AllLessons.Lesson11.Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public void getTime(){
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
