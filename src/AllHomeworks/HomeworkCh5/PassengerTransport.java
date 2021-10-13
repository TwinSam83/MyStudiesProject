package AllHomeworks.HomeworkCh5;

public class PassengerTransport extends LandTransport {
    String bodyType;
    int numberOfPassengers;

    String description() {
        return "За время " + time + "ч " + "автомобиль " + brand + " мощностью " + getPowerInKvt(power) + " квт" +
                " двигаясь с макс. скоростью " +
                maxSpeed + " км/ч" + " проедет " + getKmPerTime(time) + " км" +  " и израсходует " +
                consumption(getKmPerTime(time)) + " литров топлива";
    }

    double time;
    int distance;

    public double getKmPerTime(double time) {
        double distance = time * maxSpeed;
        return distance;
    }

    private double consumption(double distance) {
        return (fuelConsumption / 100.0) * distance;
    }

    public double getPowerInKvt(int power) {
        return power * 0.74;
    }
}

