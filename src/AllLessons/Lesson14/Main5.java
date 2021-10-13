package AllLessons.Lesson14;

public class Main5 {
    public static void main(String[] args) {
        try {
            throw new MyException(34567890);
        }catch (MyException e){
            e.printStackTrace();
        }
        //ctrl + p
    }
}
