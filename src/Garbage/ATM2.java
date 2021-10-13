public class ATM2 {
    private void addMoney() {
    }

    private void takeConcreteMoney() {
    }

    private void takeOffMoney() {
    }

    public synchronized void workWithAtm(Atm atm) {
        switch (atm) {
            case AddMoney:
                addMoney();
                break;
            case TakeConcreteMoney:
                takeConcreteMoney();
                break;
            case TakeOffMoney:
                takeOffMoney();
                break;
        }
    }

    enum Atm {
        AddMoney,
        TakeConcreteMoney,
        TakeOffMoney
    }
}

