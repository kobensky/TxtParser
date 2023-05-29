package TXTparserTest.Klasses;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public abstract class TxtParser {
    public static void parseTxt(String inputFilePath, String outputFilePath) {
        HashSet<String> UniqPhones = new HashSet<>();

        File myFile = new File(inputFilePath);
        FileReader phonesFile = null;
        try {
            phonesFile = new FileReader(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner scan = new Scanner(phonesFile);
        while (scan.hasNextLine()) {
            UniqPhones.add(scan.nextLine());
        }

        try {
            phonesFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List listOfPhones = new ArrayList(UniqPhones);
        FileWriter nFile = null;
        try {
            nFile = new FileWriter(outputFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(Object s : filterListByPhoneCode(deliteTags(listOfPhones, 22), "+375")) {
            try {
                nFile.write(s+ "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            nFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> deliteTags (List<String> listOfObjects, int lastSymbolOfOpenTag) {
        List<String> A = new ArrayList<>();
        listOfObjects.stream()
                .forEach((s) -> A.add(s.toString().substring(lastSymbolOfOpenTag,
                        s.toString().indexOf("</Billing_Phone></Order>"))));
        return A;
    }
    public static List<String> filterListByPhoneCode (List<String> listOfPhones, String phoneCode) {
        List<String> B = listOfPhones.stream()
                .filter(s -> s.startsWith(phoneCode) && s.length() == 13)
                .toList();
        return B;
    }

}
