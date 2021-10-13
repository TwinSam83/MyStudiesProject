package AllLessons.Lesson9;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        } catch (NullPointerException e) {
            // e.printStackTrace();
            System.out.println("У нас бросилась ошибка");
        }

    }
}
