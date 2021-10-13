package AllHomeworks.HomeworkCh6;

public class Nasda implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        int n = (int) (Math.random() * 16);
        if (n > 8) {
            System.out.println("Предварительная диагностика систем пройдена");
            return true;
        } else {
            System.out.println("Проблемы с закрытием клапана, отмена запуска ");
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели капсульного корабля Fuji запущены. Все готово к запуску.");
    }

    @Override
    public void start() {
        System.out.println("Старт капсульного корабля Fuji");
        System.out.println();
    }
}


