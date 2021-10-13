package AllHomeworks.HomeworkCh3;

import java.util.Scanner;

public class HomeWork3p9 {
    public static void main(String[] args) {
        /*
        Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int n = sc.nextInt();
        int sumLeft = 0;
        int sumRight = 0;
        if (n % 2 == 0 && n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 15);
                System.out.print(array[i] + " ");
            }
            for (int i = 0; i < (n / 2); i++) {
                sumLeft += array[i];
                sumRight += array[n - 1 - i];
            }
            if (sumRight > sumLeft) {
                System.out.println(" Суммы правой половины больше");
            } else if (sumRight < sumLeft) {
                System.out.println(" Суммы левой половины больше");
            } else {
                System.out.println(" Суммы обоих модулей равны");
            }
        } else {
            System.out.println(" Вы ввели неподходящее число, введите положительное и четное число ");

        }
    }
}

