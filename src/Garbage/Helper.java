import java.util.Random;

public class Helper {
    public static int timeout() {
        Random random = new Random();
        return random.nextInt(1000);
    }
    public static synchronized void print(int i){
        System.out.println(i);
    }
}
