package AllHomeworks.HomeworkCh2;

public class HomeWork2p5 {
    public static void main(String[] args) {
        /*
        Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
         */
        int a = 1;
        double d = 2.54;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " in == " + i * 2.54 + " cm");
        }
    }
}
