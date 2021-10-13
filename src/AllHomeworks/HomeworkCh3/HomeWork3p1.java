package AllHomeworks.HomeworkCh3;

public class HomeWork3p1 {
    public static void main(String[] args) {
        /*
        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
         */
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println();
            for (int i = 0; i < 10; i++){
            System.out.println(nums[i]);
        }
    }
}
