package Garbage.tms.lesson8;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public final class FileUtils {

    public static final String RESOURCES = "resources";
    public static final String VOWELS = "уеыаоэяиюё";

    private FileUtils() {
    }

    public static void readFile(String fullName) {
        //File resources = Paths.get("resources", fullName).toFile();
        File file = new File(RESOURCES, fullName);
        if (file.exists() && file.isFile()) {
            //BufferedReader fileReader = new BufferedReader(new FileReader(file))
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Файл не найден");
            }
        }
    }

    public static void readAllVowels(String fullName) {
        File file = new File(RESOURCES, fullName);
        if (file.exists() && file.isFile()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    String s = scanner.next();
                    if (isStartWithVowel(s)) {
                        System.out.println(s);
                    }
                }
            } catch (IOException e) {
                System.out.println("Файл не найден");
            }
        }
    }

    private static boolean isStartWithVowel(String word) {
        return VOWELS.contains(String.valueOf(word.toLowerCase(Locale.ROOT).charAt(0)));
    }

    public static void printMaxDigitsSequence(String fullName) {
        File file = new File(RESOURCES, fullName);
        if (file.exists() && file.isFile()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    int max = 0;
                    int current = 0;
                    for (char c : line.toCharArray()) {
                        if (Character.isDigit(c)) {
                            current++;
                        } else {
                            max = Math.max(max, current);
                            current = 0;
                        }
                        max = Math.max(max, current);
                    }
                    System.out.println(max + " - " + line);
                }
            } catch (IOException e) {
                System.out.println("Файл не найден");
            }
        }
    }
}
