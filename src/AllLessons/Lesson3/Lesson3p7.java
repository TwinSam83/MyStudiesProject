package AllLessons.Lesson3;

import java.util.Scanner;

public class Lesson3p7 {
    public static void main(String[] args) {
        // найти макс и мин значение в массиве
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи разномерность массива");

        int min = 0;
        int max = 0;
        int n = scanner1.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Введи значение массива");
            array[i] = scanner1.nextInt();
        }

        for (int i = 0; i < n; i++) {

        }

            if (array[n] < min)
                min = array[n];
            if (array[n] > max)
                max = array[n];

            System.out.println("min is: " + min + "; max is: " + max);

        }
    }



