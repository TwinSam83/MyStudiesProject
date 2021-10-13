public class Egg extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(Helper.timeout());
                System.out.println("Egg");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
