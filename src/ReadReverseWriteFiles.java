import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadReverseWriteFiles {

// file from path must have empty last line

    static void reverseStringsFromFile(String path, boolean append) {   // append for FileWriter
        List<String> strings = new ArrayList<>();
        //--------------------------------------------------READ--------------------------------------------------//
        try (FileReader reader = new FileReader(path)) {
            int c = 0;
            String line;
            while (c != -1) {
                line = "";
                do {
                    c = reader.read();
                    if(c != -1) {
                        line = line.concat(String.valueOf((char) c));
                    }
                } while ((char) c != '\n' && c != -1);
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //--------------------------------------------WRITE and REVERSE--------------------------------------------//
        try (FileWriter writer = new FileWriter(path, append)) {
            for (int i = strings.size() - 1; i >= 0; i--) {
                writer.write(strings.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
