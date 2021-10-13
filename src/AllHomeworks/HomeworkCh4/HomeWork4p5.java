package AllHomeworks.HomeworkCh4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4p5 {
    public static void main(String[] args) {
        //Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        //строкой и т. д.)
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
    }
}
