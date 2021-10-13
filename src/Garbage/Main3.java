import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("file1.txt");
             FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            int a;
            while ((a = fileInputStream.read()) != -1) {
                fileOutputStream.write(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}