package Garbage;
/*
����� min � max ����� ���������� ��������
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class task04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(500));
        }
        System.out.println(list);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        Optional<Integer> min = result.stream().min(Integer::compare);
        Optional<Integer> max = result.stream().max(Integer::compare);
        System.out.println("Min " + min.get());
        System.out.println("Max " + max.get());
    }
}
