package AllLessons.Lesson4;

import java.util.Random;

public class Lesson4p4 {
    public static void main(String[] args) {
        // поиск макс и мин элементов
        int[][] array = new int[4][4];
        Random random = new Random();
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(30);

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
