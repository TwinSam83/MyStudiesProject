package AllHomeworks.HomeworkCh3;

public class HomeWork3p8 {
    public static void main(String[] args) {
        /*
        Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.
         */
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 9);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random() * 9);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int[] array3 = new int[10];
        for(int i = 0; i < 10; i++){
            array3[i] = array1[i]/array2[i];
            if(array2[i] == 0){
                break;
            }
            System.out.print(array3[i] + " ");
        }
    }
}


