package AllHomeworks.HomeworkCh5;

public class TransportTest {
    public static void main(String[] args) {

        PassengerTransport car = new PassengerTransport();
        car.brand = "Toyota";
        car.power = 450;
        car.maxSpeed = 250;
        car.fuelConsumption = 20;
        car.time = 2.3;

        System.out.println(car.description());
        System.out.println();

        CargoTransport cargo = new CargoTransport();
        cargo.carryingCapacity = 12;
        cargo.amountOfCargo = 7;

        System.out.println(cargo.description());
        cargo.examination();
        System.out.println();

        CivilTransport passengerPlane = new CivilTransport();
        passengerPlane.numberOfPassengers = 290;
        passengerPlane.accommodation = 300;

        System.out.println(passengerPlane.description());
        passengerPlane.landing();
        System.out.println();

        MilitaryTransport fighter = new MilitaryTransport();
        fighter.numberOfMissiles = 0;
        System.out.println(fighter.description());
        fighter.ammunition();
        System.out.println();
        fighter.ejectionSystems = false;
        System.out.println(fighter.description2());
        fighter.bailout(fighter.ejectionSystems);

    }
}
