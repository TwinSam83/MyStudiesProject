package AllHomeworks.HomeworkCh1;

public class HomeWork1p4 {
    public static void main(String[] args) {
        //Даны 3 целых числа. Найти количество положительных чисел в исходном
        //наборе.
        int a = 4;
        int b = 2;
        int c = 8;
        int counter = 0;

        if (a > 0) {
           counter += 1;
        }
        if (b > 0) {
            counter += 1;
        }
        if (c > 0) {
            counter += 1;
        }
        System.out.println("Количество положительных чисел " + counter);
    }
}
