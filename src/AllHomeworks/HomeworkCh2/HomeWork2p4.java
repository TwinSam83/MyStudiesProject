package AllHomeworks.HomeworkCh2;

public class HomeWork2p4 {
    public static void main(String[] args) {

        //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

        int a = 100;
        int b = 5;
        int result = 0;
        for (int i = 0; i < a; i++) {
            result = result + b;
        }
        System.out.println(result);

    }
}
