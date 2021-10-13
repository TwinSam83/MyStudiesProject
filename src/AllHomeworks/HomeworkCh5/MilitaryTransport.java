package AllHomeworks.HomeworkCh5;

public class MilitaryTransport extends AirTransport {
    boolean ejectionSystems;
    int numberOfMissiles;

    String description() {
        return "Наведение прошло успешно, производим запуск ракеты";
    }
    String description2(){return "Нас подбили, срочно катапультируемся" ;}

    public void ammunition() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void bailout(boolean ejectionSystems) {
        if(ejectionSystems == true) {
            System.out.println("Катапультирование прошло успешно");
        } else if (ejectionSystems == false){
            System.out.println("У вас нет такой системы");
        }
    }
}
