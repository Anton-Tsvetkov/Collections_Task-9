import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkWithFileContent {

// file from path must have empty last line

    //--------------------------------------------------READ--------------------------------------------------//
    static List<String> transferFromFileToList(String path) {
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

    //--------------------------------------------WRITE and REVERSE--------------------------------------------//
    static void writeLinesToFileInReverseOrder(String path, boolean append) {
        List<String> stringList = transferFromFileToList(path);
        try (FileWriter writer = new FileWriter(path, append)) {
            for (int i = stringList.size() - 1; i >= 0; i--) {
                writer.write(stringList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
