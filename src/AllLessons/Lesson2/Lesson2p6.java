package AllLessons.Lesson2;

public class Lesson2p6 {
    public static void main(String[] args) {
        // вывести сумму: 1+2+4+8+...256

//        while (a <= 256){
//            a = a+a;
//        }
//        System.out.println(a);

        int a = 1;
        int count = 0;
        while (a <= 256){
            count+= a;
            a*=2;
        }
        System.out.println(count);


        }
    }
//511
