package Dz.ATM;

public class Thread2 extends Thread{
    private Dz.ATM.Purse value;
    private int money;

    public Thread2(Dz.ATM.Purse value, int money) {
        this.value = value;
        this.money = money;
    }

    @Override
    public void run() {
        AtmService.takeOffAllMoney(value);
        System.out.println("Поток 2 закрыт");
    }
}
