package AllHomeworks.HomeworkCh4;

public class Oop {
    public Oop() {
    }
    public static void main(String[] args) {

Oop oop = new Oop();
oop.summa(45,67);
oop.del(4,3);
oop.mult(3,3);
oop.subt(10,5);
    }
    int a ;
    int b ;

    public void summa(int a, int b){
        System.out.println((a + b));
    }
    public void subt(int a, int b){
        System.out.println((a - b));
    }
    public void del(double a, double b){
        System.out.println((a / b));
    }
    public void mult(int a, int b){
        System.out.println((a * b));
    }

}



