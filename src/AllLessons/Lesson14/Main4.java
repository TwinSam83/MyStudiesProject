package AllLessons.Lesson14;

public class Main4 {
    public static void main(String[] args) {
//        try {
//           //........
//            throw new NullPointerException();
//            //........
//            System.out.println(a / b);
//        } catch (NullPointerException e) {
//            // e.printStackTrace();
//            System.out.println("У нас бросилась ошибка");
//            System.exit(0);
//        } finally {
//            System.out.println("Мы зашли в finally");
//        }
        try {
            int a = 5;
            int b = 6;
            System.out.println(a/b);
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
