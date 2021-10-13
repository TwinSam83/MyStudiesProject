package AllHomeworks.HomeworkCh6;

public class Spiral implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        int n = (int) (Math.random() * 20);
        if (n > 6) {
            System.out.println("Все приборы работают отлично");
            return true;
        } else {
            System.out.println("У нас где-то неполадки");
            return false;
        }
    }
    @Override
    public void engineStart() {
        System.out.println("Корабль Bor5 запущен. Все работает хорошо.");
    }

    @Override
    public void start() {
        System.out.println("Старт корабля Bor5");
    }
}
