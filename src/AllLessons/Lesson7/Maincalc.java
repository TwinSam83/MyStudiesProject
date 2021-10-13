package AllLessons.Lesson7;

import java.util.Scanner;

public class Maincalc {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        Calculator1 maincalc = new Calculator1();
        menu.startcalc();
        double n1 = sc.nextDouble();
        menu.opcalc();
        sc.nextLine();
        String op = sc.nextLine();
        double n2 = sc.nextDouble();
        if (op.equals("+")) {
            double result = maincalc.addition(n1, n2);
        }
        if (op.equals("-")) {
            double result = maincalc.subtraction(n1, n2);
        }
        if (op.equals("*")) {
            double result = maincalc.multiplication(n1, n2);
        }
        if (op.equals("/")) {
            double result = maincalc.division(n1, n2);
        }


    }
}
