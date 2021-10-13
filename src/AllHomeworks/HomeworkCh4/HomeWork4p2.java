package AllHomeworks.HomeworkCh4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4p2 {
    public static void main(String[] args) {
        //Вывести нечетные элементы находящиеся под главной
        //диагональю(включительно).
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                    count++;
                }
            }
        }
    }
}




