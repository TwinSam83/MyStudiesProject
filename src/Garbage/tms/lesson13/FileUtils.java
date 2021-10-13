package Garbage.tms.lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FileUtils {

    private FileUtils() {
    }

    public static List<String> readFile(File file) {
        if (file == null || !file.exists() && !file.isFile()) {
            return Collections.EMPTY_LIST;
        }
        return getStrings(file);
    }

    private static ArrayList<String> getStrings(File file) {
        ArrayList<String> resultList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null){
               resultList.add(str);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultList;
    }

    public static boolean writeToFile (File fileToWrite, List<String> list){
        if (fileToWrite == null || list == null || list.isEmpty()) {
            return false;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))){
            for (String str:
                 list) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Файл записан");
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return false;
    }
}
