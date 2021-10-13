package AllHomeworks.HomeworkCh5;

public class CivilTransport extends AirTransport{
    int numberOfPassengers;
    boolean businessClass;
    int accommodation;

    String description() {
        return "Мы хотим расположить в самолете пассажиров в количестве " + accommodation + " человек";
    }

    public void landing() {
        if (numberOfPassengers > accommodation) {
            System.out.println("Все пассажиры поместились");
        } else {
            System.out.println("Вам необходим самолет побольше");
        }
    }
}


