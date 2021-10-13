package Garbage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainL {
    public static void main(String[] args) {
        String str = "Test123";
        Pattern pattern = Pattern.compile("[a-z]{3}\\d{2}$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
