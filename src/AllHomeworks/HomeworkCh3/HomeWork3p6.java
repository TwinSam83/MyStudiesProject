package AllHomeworks.HomeworkCh3;

public class HomeWork3p6 {
    public static void main(String[] args) {
        /*
        Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
         */
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
            System.out.println(" Массив строго последователен");
        } else {
            System.out.println(" Массив не последователен");

        }

    }
}
