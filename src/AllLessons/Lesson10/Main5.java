package AllLessons.Lesson10;

import java.io.FileReader;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("fileWriter.txt")) {
                int a;
                while ((a = fileReader.read()) != -1) {
                    System.out.println(a);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
