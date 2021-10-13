package Garbage.tms.lesson11.pets;

import Garbage.tms.lesson11.Pet;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
