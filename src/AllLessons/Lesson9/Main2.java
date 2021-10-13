package AllLessons.Lesson9;

public class Main2 {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            // e.printStackTrace();
//            System.out.println("У нас бросилась ошибка");
//            System.exit(0);
        } finally {
            System.out.println("Мы зашли в finally");
        }
    }
}

