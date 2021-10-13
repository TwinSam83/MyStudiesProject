package LessonCalculator;

public class Calculator implements Operation {

    @Override
    public double addition(double x, double y) {
        return x + y;
    }

    @Override
    public double subtraction(double x, double y) {
        return x - y;
    }

    @Override
    public double multiplication(double x, double y) {
        return x * y;
    }

    @Override
    public double division(double x, double y) {
        if (y == 0) {
            System.out.println("На ноль делить нельзя");
            return 0;
        }
        return x / y;
    }

    public double operate(double x, double y, String operator) {
        double result;

        switch (operator) {
            case "+":
                result = addition(x, y);
                break;
            case "-":
                result = subtraction(x, y);
                break;
            case "*":
                result = multiplication(x, y);
                break;
            case "/":
                result = division(x, y);
                break;
            default:
                result = 0;
                System.out.println("Введен неправильный оператор");

        }
        return result;
    }


}


