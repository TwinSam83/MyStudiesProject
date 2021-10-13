package AllLessons.Lesson11;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {
       // LocalDate localDate = LocalDate.now();
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        Printable printable = (s) -> System.out.println(s);
        printable.print("helloworld");
    }
}
