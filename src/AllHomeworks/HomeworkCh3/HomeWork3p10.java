package AllHomeworks.HomeworkCh3;

import java.util.Scanner;

public class HomeWork3p10 {
    public static void main(String[] args) {
        /*
        Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int n = sc.nextInt();
        if (n < 4) {
            System.out.println(" Введите число больше 3");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * n + 1);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            System.out.println();
            int[] array2 = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    array2[j] = array[i];
                    j++;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}

