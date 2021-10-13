import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lesson22 {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(LocalDate);
//        System.out.println("====================");
//        LocalTime localTime = LocalTime.now();
//        System.out.println(LocalTime);
        Printable printable = (s) -> System.out.println(s);
        printable.print("helloworld");

    }
}
