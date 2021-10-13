package AllHomeworks.HomeworkCh3;

public class HomeWork3p7 {
    public static void main(String[] args) {
        /*
        Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.
         */
        int max = 0;
        int[] array = new int[12];
        for (int i = 0; i < 12; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int lastIndex = 0;
        for (int i = 0; i < 12; i++) {
            if (array[i] >= max) {
                max = array[i];
                lastIndex = i;
            }
        }
        System.out.println(" Максимальный элемент : " + max + " Индекс его последнего вхождения : " + lastIndex );
    }
}

