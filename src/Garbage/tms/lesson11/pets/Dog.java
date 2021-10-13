package Garbage.tms.lesson11.pets;

import Garbage.tms.lesson11.Pet;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
