public class ChickenEgg {
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println("spor nachat");
        egg.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(Helper.timeout());
                System.out.println("Chicken");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (egg.isAlive()) {
            System.out.println("Первым появ яйцо");
        } else {
            System.out.println("Первым появ Курица");

        }
    }
}
