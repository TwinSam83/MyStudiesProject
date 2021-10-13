package AllLessons.Lesson7;

public class Calculator1 {
    public double addition(double x, double y) {
        //double[]array = x + y;
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        if (y == 0) {
            System.out.println(" На ноль делить нельзя");
            return 0;
        }
        return x / y;
    }

    int[] array = new int[5];


}
