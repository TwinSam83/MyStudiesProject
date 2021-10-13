package AllHomeworks.HomeworkCh10;

public class Main extends Exception {
    public static void main(String[] args) {

        Car car = new Car("Audi", 250.3, 45000);
        Car superCar = new Car("Bugatti",400.9,3000000);
        Car jalopy = new Car("Запорожец",117.9, 350);
        handleCarStart(car);
        handleCarStart(superCar);
        handleCarStart(jalopy);
    }

    public static void handleCarStart(Car car) {
        try {
            car.start();
        } catch (EngineStartException e) {
            e.printStackTrace();
        }
    }
}
