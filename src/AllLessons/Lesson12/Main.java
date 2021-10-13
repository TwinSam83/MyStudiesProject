package AllLessons.Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List.add(4);
        List.add(6);
        List.add(2);
        List.add(1);
        List.add(8);
        List.add(-5);
        List.add(9);
        List.add(8);
        List.add(4);

        List<Integer> result = List.stream().filter(x -> x < 4).collect(Collectors.toList());

        System.out.println(result);

    }
}
