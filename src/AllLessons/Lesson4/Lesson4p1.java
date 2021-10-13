package AllLessons.Lesson4;

import java.util.Random;

public class Lesson4p1 {
    public static void main(String[] args) {
       /*
        найти сумму всех элементов
       сортировка всех элементов в массиве
        сортировка отдельных массивов
        */
        int[][] arr = new int[5][5];
        Random random = new Random();

        int summ = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(20);
                summ += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(summ);
    }
}



