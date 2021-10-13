package AllLessons.Lesson3;

import java.util.Scanner;

public class Lesson3p6 {
    public static void main(String[] args) {
//  найти среднее арифметическое
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи разномерность массива");
        double sr = 0;
        double summ = 0;
        int n = scanner1.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Введи значение массива");
            array[i] = scanner1.nextInt();
        }

        for (int i = 0; i < n; i++) {
            summ = summ +  array[i];


        }
        sr = summ/n;
        System.out.println(sr);

    }


}
