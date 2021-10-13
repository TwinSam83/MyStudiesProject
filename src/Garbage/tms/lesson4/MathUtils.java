package Garbage.tms.lesson4;

public final class MathUtils {
    private MathUtils (){}

    public static int getFactorial (int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int getFactorialRecursive (int number){
        if (number == 1){
            return number;
        }
        return number * getFactorialRecursive(--number);
    }
}
