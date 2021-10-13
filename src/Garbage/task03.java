package Garbage;
/*
������������� �� ��������
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(500));
        }
        System.out.println(list);
        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
    }
}
