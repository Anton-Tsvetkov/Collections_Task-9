package com.epam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static String cleanWord(String word) {
        word = word
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll(";", "")
                .replaceAll(",", "")
                .replaceAll("\\.", "")
                .replaceAll("\n", "");
        return word;
    }

    public static Map<String, Integer> searchDifferentWords(String path) {
        Map<String, Integer> differentWordsMetric = new HashMap<>(200);
        try (Scanner scanner = new Scanner(new File(path))) {
            int wordFrequency;
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = cleanWord(word);
                if (differentWordsMetric.get(word) != null) wordFrequency = differentWordsMetric.get(word) + 1;
                else wordFrequency = 1;
                differentWordsMetric.put(word, wordFrequency);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return differentWordsMetric;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = searchDifferentWords("src\\com\\epam\\source\\FileWithText.txt");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }

        System.out.println(map.size());
    }

}
