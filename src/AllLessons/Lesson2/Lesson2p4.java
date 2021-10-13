package AllLessons.Lesson2;

public class Lesson2p4 {
    public static void main(String[] args) {
        int a = 2;
        while (a < 100){
            a++;
            if (a % 2 == 0) {
                continue;

            }
            System.out.println(a);
        }
    }
}
