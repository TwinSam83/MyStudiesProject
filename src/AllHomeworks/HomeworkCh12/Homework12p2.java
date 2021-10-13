package AllHomeworks.HomeworkCh12;

import java.util.ArrayList;

public class Homework12p2 {
    public static void main(String[] args) {
        /*
        arraylist удалить четные значения
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(22);
        list.add(10);
        list.add(25);
        list.add(6);
        list.add(18);
        list.add(100);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                --i;
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
