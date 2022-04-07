package output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    private String[] lines;

    public FileParser() {

    }

    public void setLines(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
            this.lines = lines.toArray(new String[lines.size()]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getLines() {
        return this.lines;
    }

}
