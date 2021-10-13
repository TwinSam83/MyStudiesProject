package Garbage.tms.lesson3;

public class Solution {
    public static void main(String[] args) {
        PhoneTest phoneTest1 = new PhoneTest();
        phoneTest1.setNumber(11111);
        phoneTest1.setModel("iPhone");
        phoneTest1.setWeight(100);

        PhoneTest phoneTest2 = new PhoneTest();
        phoneTest2.setNumber(22222);
        phoneTest2.setModel("Samsung");
        phoneTest2.setWeight(100);

        PhoneTest phoneTest3 = new PhoneTest();
        phoneTest3.setNumber(33333);
        phoneTest3.setModel("Huawei");
        phoneTest3.setWeight(100);

        System.out.println(phoneTest1);
        System.out.println(phoneTest2);
        System.out.println(phoneTest3);

        System.out.println(phoneTest1.getNumber());
        System.out.println(phoneTest2.getNumber());
        System.out.println(phoneTest3.getNumber());

        phoneTest1.receiveCall("Vasya", 12345);
    }
}
