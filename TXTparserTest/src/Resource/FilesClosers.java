package Resource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FilesClosers {
    public static void readerCloser (FileReader fileReader) throws IOException {
        fileReader.close();
    }
    public static void writerCloser (FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }
}
