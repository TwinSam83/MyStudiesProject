package AllHomeworks.HomeworkCh6;

public class Cosmodrome {

    public void launch(IStart iStart) {
        if (iStart.preLaunchSystemCheck()) {
            iStart.engineStart();
            System.out.println("Производим запуск двигателей");
            for (int i = 10; i > 0; i--) {
                System.out.print(i + ", ");
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
            System.out.println();
        }
    }
}
