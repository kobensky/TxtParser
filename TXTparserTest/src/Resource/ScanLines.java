package Resource;

import java.io.FileReader;
import java.util.Scanner;

public abstract class ScanLines {
    public static Scanner linesScanner (FileReader fileToScan) {
        return new Scanner(fileToScan);
    }
}
