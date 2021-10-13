package AllLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mainArr {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        List<Integer> result = list.stream().filter(x -> x < 4).collect(Collectors.toList());
        System.out.println(result);
    }
}
