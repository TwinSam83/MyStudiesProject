package Garbage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
������� �������� ������ 50 �� �������� ������ 5 ��������
 */
public class task05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(90));
        }
        System.out.println(list);
        list.stream().skip(5).filter(x -> x > 50).forEach(x -> System.out.print(x + " "));
    }
}