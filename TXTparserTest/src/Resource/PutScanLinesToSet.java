package Resource;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public abstract class PutScanLinesToSet {
    public static Set<String> putScanLinesToSet (Scanner scanner) {
        Set<String> phoneNumbersSet = new HashSet<>();
        while (scanner.hasNextLine()) {
            phoneNumbersSet.add(scanner.nextLine());
        }
        return phoneNumbersSet;
    }
}
