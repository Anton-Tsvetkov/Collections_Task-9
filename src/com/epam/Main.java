package com.epam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    //--------------------------------------------------READ--------------------------------------------------//
    public static List<String> convertFromFileLinesToList(String path) {
        List<String> stringList = new ArrayList<>();
        try (FileReader reader = new FileReader(path)) {
            int c = 0;
            String line;
            while (c != -1) {
                line = "";
                do {
                    c = reader.read();
                    if (c != -1) {
                        line = line.concat(String.valueOf((char) c));
                    }
                } while ((char) c != '\n' && c != -1);
                System.out.println(line);
                stringList.add(line);
                System.out.println(stringList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringList.toString());
        return stringList;
    }

    //--------------------------------------------WRITE and SORT--------------------------------------------//
    public static void writeLinesToFileSortedByLength(String path, boolean append) {   // append for FileWriter
        try (FileWriter writer = new FileWriter(path, append)) {
            List<String> stringList = convertFromFileLinesToList(path);
            System.out.println(stringList.toString());
            Comparator<String> comp = Comparator.comparingInt(String::length);
            stringList.sort(comp);
            for (String string : stringList) {
                writer.write(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeLinesToFileSortedByLength("src\\com\\epam\\source\\Poem.txt", true);
    }
}







