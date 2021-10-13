package AllLessons.Lesson8;

public class StringProcessing {
    public static void printString(String str) {
        System.out.println(str);
    }

    public static void findLastCharacter(String str) {
        if (str != null && !str.isEmpty()) {
            System.out.println(str.charAt(str.length() - 1));
        }
    }

    public static void proverkaEnd(String str) {
        System.out.println(str.contains("!!!"));
    }

    public static void nachaloStr(String str) {
        System.out.println(str.startsWith("I like"));
    }

    public static void provJava(String str) {
        System.out.println(str.contains("Java"));
    }
}

