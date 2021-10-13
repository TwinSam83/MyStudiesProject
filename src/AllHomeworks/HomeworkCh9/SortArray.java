package AllHomeworks.HomeworkCh9;

public class SortArray {
    /*
      Вам необходимо написать метод, который в своих аргументах должен принимать 2 массива строк.
      Эти два массива нужно объединить в третий массив и отсортировать. Упор в производительность
    */
    static String[] arr(String[] array1, String[] array2) {
        String[] array3 = new String[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            array3[count++] = array2[j];
        }
        for (int i = array3.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array3[j].compareTo(array3[j + 1]) > 0) {
                    String tmp = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = tmp;
                }
            }
        }
        return array3;
    }
}
