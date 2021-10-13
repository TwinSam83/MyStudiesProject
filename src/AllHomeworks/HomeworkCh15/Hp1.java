package AllHomeworks.HomeworkCh15;

public class Hp1 {
    public static void main(String[] args) {
        // Есть какой-то текст (текст задаете самостоятельно). Найти все слова "cat" и посчитать их количество
        String s = "My cat is so funny. She likes to play with cat toys.";
        s.matches(".*?\\bcat\\b.*?");
//        Pattern pattern = Pattern.compile("\\bcat\\b");
//        Matcher m = pattern.matcher("Print cat");
//        m.find();
//        System.out.println(m.group());
    }
}
