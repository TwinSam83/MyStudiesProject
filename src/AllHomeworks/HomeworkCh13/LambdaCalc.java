package AllHomeworks.HomeworkCh13;

public class LambdaCalc {
    public static void main(String[] args) {
//        Operationable op = new Operationable(){
//            public int calculate(int x, int y){
//                return x + y;
//            }
//        };
//    }
////    Operationable addition = (int x, int y)-> x + y;
////    Operationable subtraction = (int x, int y)-> x - y;
////    Operationable multiplication = (int x, int y)-> x * y;
////    Operationable division = (int x, int y)-> x / y;
//
//    new Operationable() {
//        @Override
//        public int calculate(int x, int y, String operator) {
//            switch (operator) {
//                case "+":
//                    return x + y;
//                case "-":
//                    return x - y;
//                case "*":
//                    return x * y;
//                case "/":
//                    return x / y;
//                default:
//                    System.out.println("Введен неправильный оператор");
//                    return 0;
//            }
//        }
//    };
//
//    public double operate(double x, double y, String operator) {
//        double result;
//
//
//        return 0;
//    }
//
//    interface Operationable{
//        int calculate(int x, int y, String operator);
        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(900); // 600 долларов


    }
    public interface Consumer<T> {
        void accept(T t);
    }
}
