package Garbage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class task01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(20);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(150));
        }
        System.out.println("List " + list);

        List<Integer> list1 = list.stream().filter(x -> x < 100).collect(Collectors.toList());


        list.stream().filter(x -> x < 50).forEach(x -> System.out.print(x + " "));
    }
}

