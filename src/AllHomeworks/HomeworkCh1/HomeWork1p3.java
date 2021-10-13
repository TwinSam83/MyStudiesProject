package AllHomeworks.HomeworkCh1;

public class HomeWork1p3 {
    public static void main(String[] args) {
        /*
         Дано целое число. Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
        10. Вывести полученное число.
        */
        int a = -6;
        if (a > 0) {
            System.out.println(" Число положительное");
            a += 1;
        } else if (a < 0) {
            System.out.println(" Число отрицательное");
            a -= 2;
        } else if (a == 0) {
            a = 10;
        }

        System.out.println(a);
    }
}