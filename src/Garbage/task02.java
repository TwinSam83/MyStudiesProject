package Garbage;
/*
��������� ������� ��������������
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class task02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(20);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(1000));
        }
        System.out.println("List " + list);

        List<Integer> list1 = list.stream().filter(x -> x > 500).collect(Collectors.toList());
        double result = list1.stream().mapToDouble(x -> x).sum();
        System.out.println(list1);
        System.out.println(result / list1.size());
    }
}
