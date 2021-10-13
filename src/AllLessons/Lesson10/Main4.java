package AllLessons.Lesson10;

import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("fileWriter.txt")) {

            String str = "Teach me Skills";
            fileWriter.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

