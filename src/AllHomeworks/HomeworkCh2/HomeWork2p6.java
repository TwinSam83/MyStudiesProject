package AllHomeworks.HomeworkCh2;

public class HomeWork2p6 {
    public static void main(String[] args) {
        /*
        Напишите программу вывода всех четных чисел от 2 до 100
включительно
         */

        for (int a = 2; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}

