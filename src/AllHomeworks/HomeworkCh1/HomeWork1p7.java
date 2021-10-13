package AllHomeworks.HomeworkCh1;

public class HomeWork1p7 {
    public static void main(String[] args) {
        /*
        В переменную записываете количество программистов. В
        зависимости от количества программистов необходимо вывести правильно
       окончание. Например:
       • 2 программиста
       • 1 программист
       • 10 программистов и т.д.
        */
        int a = 20;
        if (a == 1) {
            System.out.println(a + " Программист");
        } else if (a > 1 && a < 5) {
            System.out.println(a + " Программиста");
        } else {
            System.out.println(a + " Программистов");

        }
    }
}
