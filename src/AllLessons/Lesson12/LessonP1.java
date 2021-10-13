package AllLessons.Lesson12;

import java.util.ArrayList;
import java.util.List;

public class LessonP1 {
    public static void main(String[] args) {
        // вывести значение меньше 100(foreach, collect)
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

        for (Integer i : List) {
            if(i < 100)
            System.out.println(i);
        }
        //List.stream()
            //List<Integer> result = List.stream().filter(x -> x < 100).collect(Collectors.toList());

       // System.out.println(result);
    }
}
//    List<Integer> list = new ArrayList<>(20);
//    Random r = new Random();
//        for (int i = 0; i < 10; i++) {
//        list.add(r.nextInt(150));
//        }
//        System.out.println("List " + list);
//
//        List<Integer> list1 = list.stream().filter(x -> x < 100).collect(Collectors.toList());
//
//
//        list.stream().filter(x -> x < 50).forEach(x -> System.out.print(x + " "));
//        //