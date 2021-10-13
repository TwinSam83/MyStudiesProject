package AllLessons.Lesson3;

import java.util.Scanner;

public class Lesson3p8 {
    public static void main(String[] args) {
// найти колво эл. между макс. и мин значением.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи разномерность массива");
        int count = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println(" Введи значение массива");
            array[i] = sc.nextInt();
        }


    }
}
