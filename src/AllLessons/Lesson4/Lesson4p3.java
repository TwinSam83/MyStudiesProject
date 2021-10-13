package AllLessons.Lesson4;

import java.util.Random;

public class Lesson4p3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(30);

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for (int m = 0; m < 3; m++){
                    if(array[i][m] > array[i][m+1]){
                        int temp = array[i][m + 1];
                        array[i][m+1] = array[i][m];
                        array[i][m] = temp;
                    }
                }
            }
        }
        System.out.println("========");

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
