package Garbage.tms.lesson8;

public class Main {

    public static void main(String[] args) {
        FileUtils.readFile("pushkinPoem.txt");
        FileUtils.readAllVowels("pushkinPoem.txt");
        FileUtils.printMaxDigitsSequence("pushkinPoem.txt");
    }

}