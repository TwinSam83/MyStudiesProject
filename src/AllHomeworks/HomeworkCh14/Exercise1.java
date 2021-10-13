package AllHomeworks.HomeworkCh14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        // Определение количества четных чисел в потоке данных.
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(50));
        }
        System.out.println(list);
//        Stream<Integer> st = list.stream();
//        Predicate<Integer> pr;
//        pr = (n) -> (n % 2) == 0;
//        Stream<Integer> chet = st.filter(pr);
//        System.out.println("Количество четных чисел " + chet.count());

        //Stream<Integer> st = list.stream().filter((n) -> (n % 2) == 0).


    }
}
