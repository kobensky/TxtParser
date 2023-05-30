package resource;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FilesOpeners {
    public static FileReader openReader(String openFile) throws IOException {
        File openedFile = new File(openFile);
        return new FileReader(openedFile);
    }

    public static FileWriter openWriter(String savedFile) throws IOException {
        File writtenFile = new File(savedFile);
        return new FileWriter(writtenFile);
    }
}
