package AllHomeworks.HomeworkCh1;

public class HomeWork1p1 {
    public static void main(String[] args) {
        /*
        В переменную записываем число. Надо вывести на экран сколько в этом
        числе цифр и положительное оно или отрицательное. Например, "это
        однозначное положительное число". Достаточно будет определить, является ли
         число однозначным, "двухзначным или трехзначным и более.

         */

        int a = -10;
        if (a < 0) {
            System.out.println(" Число отрицательное");
            if (a > -10) {
                System.out.println(" Число однозначное");
            } else if (a < -9 && a > -100) {
                System.out.println(" Число двузначное");
            } else if (a < -99 && a > -1000) {
                System.out.println(" Число трехзначное");
            } else {
                System.out.println(" Число чытерехзначное и выше");
            }
        } else if (a > 0) {
            System.out.println(" Число положительное");
            if (a < 10) {
                System.out.println(" Число однозначное");
            } else if (a > 9 && a < 100) {
                System.out.println(" Число двузначное");
            } else if (a > 99 && a < 1000) {
                System.out.println(" Число трехзначное");
            } else {
                System.out.println(" Число чытерехзначное и выше");
            }
        } else {
            System.out.println(" число равно 0 ");
        }
    }
}
