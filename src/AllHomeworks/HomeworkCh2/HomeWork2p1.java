package AllHomeworks.HomeworkCh2;

public class HomeWork2p1 {
    public static void main(String[] args) {
       /* Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?
        */
        float dayValue = 10f;
        float norm = 1.1f;
        float waySum = 0.0f;

        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                waySum += dayValue;
                continue;
            }
            dayValue *= norm;
            waySum += dayValue;
        }
        System.out.println("Суммарный путь: " + waySum + " км");
    }
}
