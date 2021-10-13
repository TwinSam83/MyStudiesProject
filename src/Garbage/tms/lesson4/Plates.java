package Garbage.tms.lesson4;

public final class Plates {
    private Plates (){}

    public static void getPlate (){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
