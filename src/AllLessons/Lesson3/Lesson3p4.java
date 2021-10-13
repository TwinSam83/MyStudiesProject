package AllLessons.Lesson3;

import java.util.Scanner;

public class Lesson3p4 {
    public static void main(String[] args) {
// создать мас размерностью n . найти сумму значений массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи разномерность массива");
        int result = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Введи значение массива");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            result += array[i];




        }
        System.out.println(result);
    }
}
