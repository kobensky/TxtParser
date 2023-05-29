package Main;

import Resource.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String firstFile = "D://razrabotka_na_karantine//baza//orders.txt";
        String secondFile = "D://razrabotka_na_karantine//baza//orders3.txt";
        FileReader openFile = FilesOpeners.openReader(firstFile);
        Scanner scanner = ScanLines.linesScanner(openFile);
        Set<String> UniquePhones = PutScanLinesToSet.putScanLinesToSet(scanner);
        FilesClosers.readerCloser(openFile);
        List<String> phoneList = ParserText.textParser(UniquePhones,
                22,
                "</Billing_Phone></Order>",
                "+375");
        FileWriter savedFile = FilesOpeners.openWriter(secondFile);
        SaveListOfPhonesToFile.saveListToFile(phoneList, savedFile);
        FilesClosers.writerCloser(savedFile);

    }
}
