package AllLessons.Lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LessonP3  {
    public static void main(String[] args) {
        // отсортировать по убыванию
        List<Integer> List = new ArrayList<>();
        List.add(41);
        List.add(666);
        List.add(20);
        List.add(15);
        List.add(8);
        List.add(-5);
        List.add(909);
        List.add(8);
        List.add(42355);

                List.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
