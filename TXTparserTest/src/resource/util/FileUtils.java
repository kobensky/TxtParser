package resource.util;

import resource.service.TxtService;
import resource.exception.TxtException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
}
