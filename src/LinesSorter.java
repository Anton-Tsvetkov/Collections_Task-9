import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinesSorter {

    public static void sortByLinesLength(String path, boolean append) {   // append for FileWriter
        List<String> strings = new ArrayList<>();

        //--------------------------------------------------READ--------------------------------------------------//
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
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //--------------------------------------------WRITE and SORT--------------------------------------------//
        try (FileWriter writer = new FileWriter(path, append)) {

            Comparator<String> comp = Comparator.comparingInt(String::length);

            strings.sort(comp);
            for (String string : strings) {
                writer.write(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







