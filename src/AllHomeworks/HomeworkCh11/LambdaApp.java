package AllHomeworks.HomeworkCh11;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> x + y;
        operation = (x, y) -> x - y;

        int result = operation.calculate(23, 10);
        int result2 = operation.calculate(23, 10);

        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;
        Operationable operation4 = (int x, int y)-> x / y;
        System.out.println(result);
        System.out.println(result);

        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate(20, 10));
        System.out.println(operation3.calculate(20, 10));
        System.out.println(operation4.calculate(20, 10));
    }

    interface Operationable {
        int calculate(int x, int y);
    }
}
