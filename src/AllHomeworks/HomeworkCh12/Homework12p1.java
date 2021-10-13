package AllHomeworks.HomeworkCh12;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework12p1 {
    public static void main(String[] args) {
        /*
        arraylist найти среднееарифметическое
         */
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел через пробел:");
        String n = sc.nextLine();
        String[] array = n.split(" ");

        try {
            for (int i = 0; i < array.length; i++) {
                list.add(Integer.parseInt(array[i]));
            }
        } catch (NumberFormatException ex) {
            System.out.println("Введите числа!");
            return;
        }

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int average;
        if (list.size() > 0) {
            average = sum / list.size();
            System.out.println(average);
        }
    }
}


//  среднее арифметическое - сумма всех чисел деленная на их количество
//int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};
//double average = 0;
//if (numbers.length > 0)
//{
//    double sum = 0;
//    for (int j = 0; j < numbers.length; j++) {
//         sum += numbers[j];
//    }
//    average = sum / numbers.length;
//}


// int num [] = {5, 8, 12, -18, -54, 84, -35, 17, 37};
//        double sum = 0;
//        for (int x: num) {
//        sum += x;
//        }
//            System.out.print("среднее арифметическое чисел равно: " + sum/num.length);