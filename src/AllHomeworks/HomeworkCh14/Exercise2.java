package AllHomeworks.HomeworkCh14;

import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
        /*
Задано множество фамилий сотрудников. Разработать программу, которая отображает
все фамилии, начинающиеся на букву «Z».
         */
        Stream<String> employees = Stream.of("Petrov", "Zvonarev", "Golubkov", "Zinchenko", "Ovechkin");
        String s = "Z";
        employees
                .filter(x -> x.startsWith(s))
                .forEach(System.out::println);
    }
}
