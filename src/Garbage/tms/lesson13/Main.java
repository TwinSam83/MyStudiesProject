package Garbage.tms.lesson13;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources", "text");
        List<String> listFromFile = FileUtils.readFile(file);
        Collections.reverse(listFromFile);
        File fileToWrite = new File("resources", "reverseText");
        FileUtils.writeToFile(fileToWrite, listFromFile);
    }
}
