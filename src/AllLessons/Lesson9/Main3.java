package AllLessons.Lesson9;

public class Main3 {
    public static void main(String[] args) {
        try {
            a();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void a() throws Exception {
        int a = 5;
        int b = 6;
        throw new Exception();
    }

}
