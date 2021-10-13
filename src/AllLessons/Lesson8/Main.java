package AllLessons.Lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = " tnst";
        String s2 = "test";
        String s3 = new String("test");
        String s4 = "C, D, D, F";
        String[] array = s4.split(",");
        System.out.println(Arrays.toString(array));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.length());
        System.out.println(s1.concat(" java"));
        System.out.println(s1.isEmpty());//
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.startsWith("tU"));
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo("tUsttt"));
        System.out.println(s1.compareToIgnoreCase("dnkn"));
        System.out.println(s1.contains("a"));//
        System.out.println(s1.endsWith("t"));
        System.out.println(s1.trim());
        System.out.println(s1.replace("n","test"));

    }
}
