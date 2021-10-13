package AllHomeworks.HomeworkCh3;

public class HomeWork3p2 {
    public static void main(String[] args) {
        /*
        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 ... 7 5 3 1).
         */
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                count++;
        }
        int[] arr = new int[count];
        int n = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                arr[n] = i;
                System.out.print(arr[n] + " ");
                n++;
            }
        }
       System.out.println(" ");
        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
