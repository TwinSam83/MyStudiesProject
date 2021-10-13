package AllHomeworks.HomeworkCh5;

public class CargoTransport extends LandTransport {
    int carryingCapacity;
    int amountOfCargo;

    String description() {
        return "Мы хотим положить в грузовик груз весом " + amountOfCargo + " тонн";
    }

    public void examination() {
        if (carryingCapacity > amountOfCargo) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
