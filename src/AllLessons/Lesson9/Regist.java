package AllLessons.Lesson9;

import java.util.Scanner;

public class Regist {

    static void registration() throws Exception {
        System.out.println("Введите логин");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {

        if (s.contains("/")) {
            throw new MyException(666);
        }
        if (s.contains("*")) {
            throw new MyException(666);
        }
        if (s.contains("+")) {
            throw new MyException(666);
        }
        if (s.contains("-")) {
            throw new MyException(666);
        }
        }catch (MyException e){
            e.printStackTrace();
            System.out.println("Введите другой логин");
        }
    }
}
