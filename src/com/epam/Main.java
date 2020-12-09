package com.epam;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static String cleanWord(String word) {
        word = word
                .toLowerCase()
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll(";", "")
                .replaceAll(",", "")
                .replaceAll("\\.", "")
                .replaceAll("\n", "");
        return word;
    }

    public static Set<String> searchDifferentWords(String path) {
        Set<String> differentWordsSet = new HashSet<>();
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = cleanWord(word);
                differentWordsSet.add(word);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return differentWordsSet;
    }

    public static void main(String[] args) {
        Set<String> stringHashSet = searchDifferentWords("src\\com\\epam\\source\\FileWithStrings.txt");
        for (String str : stringHashSet) {
            System.out.println(str);
        }
        System.out.println("Find " + stringHashSet.size() + " different words");
    }
}
