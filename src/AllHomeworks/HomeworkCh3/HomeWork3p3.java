package AllHomeworks.HomeworkCh3;

public class HomeWork3p3 {
    public static void main(String[] args) {
        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
         */

        int[] array = new int[15];
        int count = 0;

        for (int i = 0; i < 15; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < 15; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        System.out.println();
        System.out.println(" Кол-во четных элементов : " + count);

    }
}
