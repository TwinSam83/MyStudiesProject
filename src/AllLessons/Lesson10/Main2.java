package AllLessons.Lesson10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt")) {
            String srt = " Hello World ";
            int a;
            byte[] array = srt.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < array.length; i++) {
                fileOutputStream.write(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
