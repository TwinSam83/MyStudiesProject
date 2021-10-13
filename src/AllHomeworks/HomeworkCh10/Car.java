package AllHomeworks.HomeworkCh10;

import java.util.Random;

public class Car {
    String brand;
    double topSpeed;
    int price;

    public Car() {
    }

    public Car(String brand, double topSpeed, int price) {
        this.brand = brand;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double gettopSpeed() {
        return topSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void settopSpeed(double speed) {
        this.topSpeed = topSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws EngineStartException {
        Random random = new Random();
        int n = random.nextInt(20);
        if (n % 2 == 0) {
            throw new EngineStartException("Автомобиль " + brand + " не завелся!!!");
        } else {
            System.out.println("Автомобиль " + brand + " завелся");
        }
    }
}
