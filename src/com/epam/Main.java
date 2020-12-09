package com.epam;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean isLetter(int symbol) {
        return switch ((char)symbol) {
            case '!', '?', ';', ',', '.', '\n' -> false;
            default -> true;
        };
    }

    public static Set<String> searchDifferentWords(String path) {
        Set<String> differentWordsSet = new HashSet<>();
        try (FileReader reader = new FileReader(path)) {
            int c = 0;
            String word;
            while (c != -1) {
                word = "";
                do {
                    c = reader.read();
                    if (c != -1 && isLetter(c)) {
                        word = word.concat(String.valueOf((char) c));
                    }
                } while ((char) c != ' ' && c != -1);
                word = word.toLowerCase().trim();
                differentWordsSet.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
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
