package AllHomeworks.HomeworkCh9;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"A", "D", "B", "Y", "P", "V"};
        String[] arr2 = new String[]{"W", "T", "J", "O"};

        String[] sortedArr = SortArray.arr(arr, arr2);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}