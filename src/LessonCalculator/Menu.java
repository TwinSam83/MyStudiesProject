package LessonCalculator;

import java.util.Scanner;

public class Menu {
    static void launch() {
        System.out.println("Введите имя пользователя");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = new String[10];
        int count = 0;
        arr[count] = s;
        ++count;
        if (count == arr.length) {
            count = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Введите пароль");
        int p = scanner.nextInt();
        start();
    }

    static void start() {
        System.out.println("Калькулятор включен");
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        double[] array = new double[5];
        int counter = 0;

        while (state) {
            System.out.println("Введите число");
            double x = sc.nextDouble();
            sc.nextLine();

            System.out.println("Введите операнд");
            String op = sc.nextLine();
            System.out.println("Введите второе число");
            double y = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            Calculator calculator = new Calculator();
            double result = calculator.operate(x, y, op);
            array[counter] = result;
            ++counter;
            if (counter == array.length) {
                counter = 0;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            // System.out.println(array.toString());

            System.out.println("Результат равен " + result);
            System.out.println("Введи х если хотите завершить работу ");
            System.out.println("Нажмите Enter если хотите продолжить ");
            String t = sc.nextLine();
            if (t.equals("x")) {
                state = false;
                System.out.println("Калькулятор выключен ");
            }


        }


    }


}
