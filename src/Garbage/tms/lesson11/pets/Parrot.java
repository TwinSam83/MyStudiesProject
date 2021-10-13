package Garbage.tms.lesson11.pets;

import Garbage.tms.lesson11.Pet;

public class Parrot extends Pet {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Parrot";
    }
}