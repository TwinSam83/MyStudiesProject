package AllLessons.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

//        int a = 6;
//        System.out.println( a==5 ? "true" : "false");
//        double b = 5%2;
//        System.out.println(b);
//
//        int a = 0;
//        while (a < 5){
//            System.out.println(a);
//            a++;
//        }
        int a = 0;
        while (a <= 10) {
            if (a % 2 == 0) {
                System.out.println(a + " Четное");
            } else {
                System.out.println(a + " Нечетное");
            }
            a++;


        }

    }


}
