package AllHomeworks.HomeworkCh2;

public class HomeWork2p3 {
    public static void main(String[] args) {
        /*
        Вычислить: 1+2+4+8+...+256
         */

        int a = 1;
        int sum = 0;
        while (a <= 256){
            sum += a;
            a*=2;
        }
        System.out.println(sum);


    }
}
