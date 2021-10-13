package AllHomeworks.HomeworkCh3;

public class HomeWork3p5 {
    public static void main(String[] args) {
        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
         */
        double sr1 = 0;
        double sr2 = 0;
        double summ1 = 0;
        double summ2 = 0;
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 15);
        }

        for (int i = 0; i < 5; i++) {
            summ1 = summ1 + array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sr1 = summ1 / 5;
        System.out.println("Среднее арифметическое " + sr1);
        System.out.println();
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 15);
        }

        for (int i = 0; i < 5; i++) {
            summ2 = summ2 + array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sr2 = summ2 / 5;
        System.out.println("Среднее арифметическое " + sr2);
        if (sr1 > sr2) {
            System.out.println("Среднее арифметическое первого массива больше чем Среднее арифметическое второго");
        }else if (sr1 < sr2){
            System.out.println("Среднее арифметическое первого массива меньше чем Среднее арифметическое второго");
        } else {
            System.out.println("Среднее арифметическое первого массива равно Средне арифметическому второго");
        }

    }
}
