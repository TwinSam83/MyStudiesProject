package AllLessons.Lesson3;

import java.util.Scanner;

public class Lesson3p5 {

    public static void main(String[] args) {
        // найти сумму четных и разность нечетных
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи разномерность массива");

        int n = scanner1.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Введи значение массива");
            array[i] = scanner1.nextInt();
        }
        int chet = 0;
        int nechet = 0;


        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                chet = array[i] + chet;
            } else {
                nechet = nechet - array[i];
            }

        }
        System.out.println(" сумму четных " + chet);
        System.out.println(" разность нечетных " + nechet);


    }
}
