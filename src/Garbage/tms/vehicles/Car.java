package Garbage.tms.vehicles;

import Garbage.tms.details.Engine;
import Garbage.tms.professions.Driver;

import java.util.Objects;

public class Car {

    private String model;
    private String type;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String type, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public void stop(){
        System.out.println("Останавливаемся!");
    }

    public void turnRight(){
        System.out.println("Поворот направо!");
    }

    public void turnLeft(){
        System.out.println("Поворот налево!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && model.equals(car.model) && type.equals(car.type) && driver.equals(car.driver) && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
