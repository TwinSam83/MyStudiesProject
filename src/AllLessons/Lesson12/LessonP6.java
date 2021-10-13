package AllLessons.Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LessonP6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        Stream stream = list.stream();
        stream.filter(x -> x.toString().length() == 3).forEach(System.out::println);
    }
}
