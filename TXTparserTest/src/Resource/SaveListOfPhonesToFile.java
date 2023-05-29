package Resource;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class SaveListOfPhonesToFile {
    public static void saveListToFile (List<String> list, FileWriter savedFile) throws IOException {
        for(String s : list) {
            savedFile.write(s+ "\n");
        }
    }
}
