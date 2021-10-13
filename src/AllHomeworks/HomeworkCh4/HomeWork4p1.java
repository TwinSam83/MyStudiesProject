package AllHomeworks.HomeworkCh4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4p1 {
    public static void main(String[] args) {
        /*
        Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
1) Поcчитать сумму четных элементов стоящих на главной диагонали.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }

            if(array[i][i] % 2==0){
                sum += array[i][i];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
