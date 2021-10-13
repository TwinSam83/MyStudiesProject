package AllHomeworks.HomeworkCh2;

public class HomeWork2p2 {
    public static void main(String[] args) {
        /*
        Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
         */

        int amebasCounter = 1;
        int amebasPer3Hours = 2;
        int timeInterval;
        int hours = 24;

        for (int i = 1; i <= hours; i++) {
            if (i % 3 == 0) {
                timeInterval = i;
                amebasCounter = amebasCounter * amebasPer3Hours;
                System.out.println(timeInterval + "h == " + amebasCounter + " amebas");
            }
        }
    }
}
