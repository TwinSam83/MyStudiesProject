package Garbage.tms.lesson4;

public class StringUtils {
    private StringUtils (){}
    public static String getInitial (String firstName, String lastName, String patronymic){
        return new StringBuilder ()
                .append(firstName.charAt(0))
                .append(".")
                .append(lastName.charAt(0))
                .append(".")
                .append(patronymic.charAt(0))
                .append(".")
                .toString()
                .toUpperCase();
    }
    public static void magicMethod (String string){
        System.out.println(string.charAt(string.length() - 1));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I like"));
        System.out.println(string.contains("java"));
        System.out.println(string.indexOf("java"));
        System.out.println(string.replace('a', 'o'));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.contains("java") ? string.substring(7, 11) : "String doesn't contains java");
    }

}
