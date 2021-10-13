package AllLessons.Lesson2;

public class Lesson2p3 {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 99) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }


    }
}
