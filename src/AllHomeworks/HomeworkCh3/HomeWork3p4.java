package AllHomeworks.HomeworkCh3;

public class HomeWork3p4 {
    public static void main(String[] args) {
        /*
        Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
         */
        int[] array = new int[20];
        int count = 0;

        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
