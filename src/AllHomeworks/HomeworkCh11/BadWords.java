package AllHomeworks.HomeworkCh11;

import java.io.*;

public class BadWords {
    public static void main(String[] args) {
        /*
      Есть 2 файла. Первый файл содержит какой-то текст, второй файл содержит запретные слова.
 В тексте из первого файла необходимо удалить все запретные слова из второй файла и записать результат в третий файл.
        */
        BufferedReader br = null;
        BufferedReader br2 = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\TMS\\src\\AllHomeworks.HomeworkCh11\\word1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            br2 = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\TMS\\src\\AllHomeworks.HomeworkCh11\\word2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String[] arr = br.readLine().split(" ");
            String[] arr2 = br2.readLine().split(" ");
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr[i].equalsIgnoreCase(arr2[j])) {
                        arr[i] = "";
                        counter++;
                    }
                }
            }
            String[] arr3 = new String[counter];
            for (int i = 0; i < counter; ) {
                for (int j = 0; j < arr.length; j++) {
                    if (!arr[j].isEmpty()) {
                        arr3[i] = arr[j];
                        ++i;
                    }
                }
            }
            for (int j = 0; j < arr3.length; j++) {
                result += arr3[j] + " ";
                System.out.print(arr3[j] + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\TMS\\src\\AllHomeworks.HomeworkCh11\\word3.txt"))) {
            bw.write(result);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}