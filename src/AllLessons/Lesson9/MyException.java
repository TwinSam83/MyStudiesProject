package AllLessons.Lesson9;

public class MyException extends Exception{
    private  int status;
//alt+insert
    public MyException(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "status=" + status +
                '}';
    }
}
