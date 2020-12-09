package com.epam;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String cleanWord(String word){
        word = word
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll(";", "")
                .replaceAll(",", "")
                .replaceAll("\\.", "")
                .replaceAll("\n","")
                .trim();
        return word;
    }

    public static Map<String, Integer> searchDifferentWords(String path) {
        Map<String, Integer> differentWordsMetric = new HashMap<>(200);
        try (FileReader reader = new FileReader(path)) {
            int wordFrequency;
            int c = 0;
            String word;
            while (c != -1) {
                word = "";
                do {
                    c = reader.read();
                    if (c != -1) {
                        word = word.concat(String.valueOf((char) c));
                    }
                } while ((char) c != ' ' && c != -1);
                word = cleanWord(word);
                if(differentWordsMetric.get(word) != null) wordFrequency = differentWordsMetric.get(word) + 1;
                else wordFrequency = 1;
                differentWordsMetric.put(word, wordFrequency);
            }
        } catch (IOException e) {
            e.printStackTrace();
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
