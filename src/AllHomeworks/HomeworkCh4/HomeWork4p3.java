package AllHomeworks.HomeworkCh4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4p3 {
    public static void main(String[] args) {
        //Проверить произведение элементов какой диагонали больше.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
