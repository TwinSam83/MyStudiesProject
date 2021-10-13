package AllHomeworks.HomeworkCh6;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunchSystemCheck() {
        int n = (int) (Math.random() * 10);
        if (n > 3) {
            System.out.println("Проверка прошла успешно");
            return true;
        } else {
            System.out.println("Проверка не прошла");
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла x30Nasp запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла x30Nasp");
        System.out.println();
    }

}
