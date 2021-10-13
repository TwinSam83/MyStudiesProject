package Garbage.tms.lesson3;

public class Person {

    private String fullName;
    private int age;

    public Person(){
        this("Fsef", 30);

    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " идет");
    }

    public void talk(){
        System.out.println(fullName + " говорит");
    }
}
