package Dz.ATM;

public class Thread1 extends Thread{
    private Dz.ATM.Purse value;
    private int money;

    public Thread1(Dz.ATM.Purse value, int money) {
        this.value = value;
        this.money = money;
    }

    @Override
    public void run() {
        AtmService.addMoney(value, money);
        System.out.println("Поток 1 закрыт");
    }
}
