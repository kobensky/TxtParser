package resource.util;

import resource.exception.TxtException;
import resource.service.TxtService;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FileUtils {

    private FileUtils() {
        throw new IllegalStateException("Util class");
    }

    public static Set<String> read(String openFile) {
        File openedFile = new File(openFile);
        try (
                FileReader fileReader = new FileReader(openedFile);
                Scanner scanner = new Scanner(fileReader)
        ) {
            return TxtService.putScanLinesToSet(scanner);
        } catch (IOException e) {
            throw new TxtException(e.getMessage(), e);
        }
    }

    public static void write (String savedFile, List<String> phoneList) {
        File writtenFile = new File(savedFile);
        try (FileWriter fileWriter = new FileWriter(writtenFile)){
            for (String s : phoneList) {
                fileWriter.write(s + "\n");
            }
        } catch (IOException e) {
            throw new TxtException(e.getMessage(), e);
        }
    }
}
