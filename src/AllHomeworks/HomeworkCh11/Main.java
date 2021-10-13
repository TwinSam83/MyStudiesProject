package AllHomeworks.HomeworkCh11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        Записать в текстовый документ число/букву и количество ее повторений,  которое/ая большее
        количество раз повторяется из другого документа
Пример 1:
  1 файл - 0 1 2 3 4 4 6 4 198
  2 файл -  4 - 3
Пример 2:
  1 файл - qazwsxedcaaea
  2 файл -  a - 4
         */

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\TMS\\src\\AllHomeworks.HomeworkCh11\\file.txt"));
//             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\TMS\\src\\AllHomeworks.HomeworkCh11\\file.txt"))
          ) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1 ; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        counter++;
                    }
                }
            }
            System.out.println(arr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
