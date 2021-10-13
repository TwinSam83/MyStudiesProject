package AllLessons.Unit9CW;

public class Test {
    public static void main(String[] args) {
        String someShit = "Моя строка";
        String someShit1 = "Моя строка1";
        int value = 1990;
        char[] chars = new char[5];
        // System.out.println(someShit.concat(" Новая"));
        // System.out.println(String.valueOf(value)); //статика
        //System.out.println(String.join("-----",someShit,someShit1));
        //System.out.println(someShit.compareTo(someShit1));
        //System.out.println(someShit1.compareTo(someShit));
        //System.out.println(someShit.charAt(0));
        //someShit.getChars(0,3,chars,2);
        //for (int i = 0; i < chars.length; i++) {
        //     System.out.println(chars[i]);
        // }
        //System.out.println(chars);
        System.out.println(someShit.equals(someShit1));
        System.out.println(someShit.equalsIgnoreCase(someShit1));
    }
}
