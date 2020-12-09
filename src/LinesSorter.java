import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinesSorter {

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
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    //--------------------------------------------WRITE and SORT--------------------------------------------//
    public static void writeToFileSortedLinesByLength(String path, boolean append) {   // append for FileWriter
        try (FileWriter writer = new FileWriter(path, append)) {
            List<String> stringList = convertFromFileLinesToList(path);
            Comparator<String> comp = Comparator.comparingInt(String::length);
            stringList.sort(comp);
            for (String string : stringList) {
                writer.write(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







