package AllLessons.Lesson4;

import java.util.Random;

public class Lesson4p2 {
    public static void main(String[] args) {
        //найти сумму элементов на главной диагонали \
        int[][] array = new int[4][4];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(30);

                System.out.print(array[i][j] + " ");
            }
            sum += array[i][i];
            System.out.println();
        }
        System.out.println(sum);

    }
}

/*
сумма элементов на побочной диагонали /
 for(int i = 0; i < 4; i++}{
 sum +=arr[i][4-1-i];
 for(int j = 4 - 1 -i; j >= 0; j--}{
 sum += arr[i][j];
 break;
 */

