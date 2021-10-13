package AllHomeworks.HomeworkCh2;

public class HomeWork2p7 {
    public static void main(String[] args) {
        /*
        Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
         */
        int sum = 0;
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) continue;
            sum += a;
        }
        System.out.println(sum);
    }
}