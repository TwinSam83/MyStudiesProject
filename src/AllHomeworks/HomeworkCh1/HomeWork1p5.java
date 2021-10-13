package AllHomeworks.HomeworkCh1;

public class HomeWork1p5 {
    public static void main(String[] args) {
        //Даны 3 целых числа. Найти количество положительных и отрицательных
        //чисел в исходном наборе.
        int a = 1;
        int b = 22;
        int c = -9;
        int positiveCounter = 0;
        int negativeCounter = 0;

        if (a > 0) {
            positiveCounter += 1;
        } else {
            negativeCounter += 1;
        }
        if (b > 0) {
            positiveCounter += 1;
        } else {
            negativeCounter += 1;
        }
        if (c > 0) {
            positiveCounter += 1;
        } else {
            negativeCounter += 1;
        }
        System.out.println("Количество положительных чисел " + positiveCounter);
        System.out.println("Количество отрицательных чисел " + negativeCounter);
    }
}
