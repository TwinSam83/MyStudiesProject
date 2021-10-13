package AllLessons.Lesson10;

import java.io.*;

public class MainLesson1 {
    public static void main(String[] args) {
        String str = "qazwsxedcaaea pll7lpu";
        //String str1;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\untitled6\\src\\fileWriter.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\untitled6\\src\\AllLessons.Lesson11\\file1.txt"))) {
            bufferedWriter.write(bufferedReader.readLine().replace("a", "L"));
            // str1 = bufferedReader.readline();
            // str1.replace("a", "L"));
            //System.out.println(bufferedReader.readLine());
            //System.out.println(str.replace("a", "L"));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
