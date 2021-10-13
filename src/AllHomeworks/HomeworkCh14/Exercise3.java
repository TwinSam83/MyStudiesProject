package AllHomeworks.HomeworkCh14;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
// Задан массив строк. Используя средства StreamAPI отсортировать строки в лексикографическом порядке.

        String[] supercars = new String[]{"Ferrari", "Lamborghini", "Porsche", "McLaren", "Bugatti", "Koenigsegg"};
        Arrays.stream(supercars).sorted().forEach(System.out::println);
    }
}
