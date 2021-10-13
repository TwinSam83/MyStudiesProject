package Dz.ATM;

public class Atm {
    public static void main(String[] args) {
        Dz.ATM.Purse purse = new Dz.ATM.Purse(1, 1000);

        Dz.ATM.Thread1 thread1 = new Dz.ATM.Thread1(purse, 500);
        Dz.ATM.Thread2 thread2 = new Dz.ATM.Thread2(purse, 31);
        thread1.start();
        thread2.start();
    }
}
