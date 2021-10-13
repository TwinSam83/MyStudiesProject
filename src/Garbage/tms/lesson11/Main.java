package Garbage.tms.lesson11;

import Garbage.tms.lesson11.pets.Cat;
import Garbage.tms.lesson11.pets.Dog;
import Garbage.tms.lesson11.pets.Parrot;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Pet dog = new Dog("Tuzik");
        Pet cat = new Cat("Vaska");
        Pet parrot = new Parrot("Kesha");
        pets.put(dog.getName(), dog);
        pets.put(cat.getName(), cat);
        pets.put(parrot.getName(), parrot);
        printPets(pets);
    }

    public static void printPets(Map<String, Pet> map) {
        if (map != null) {
            for (Map.Entry<String, Pet> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " : " + pair.getValue() + " : " + pair.getValue().getType());
            }
        }
    }
}