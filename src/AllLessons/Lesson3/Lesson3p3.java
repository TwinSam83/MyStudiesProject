package AllLessons.Lesson3;

import java.util.Scanner;

public class Lesson3p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размерность массива");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Введи значение массива");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }


    }
}
