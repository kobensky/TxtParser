package TXTparserTest.main;

import TXTparserTest.Klasses.TxtParser;

import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String firstFile = "D://razrabotka_na_karantine//baza//orders.txt";
        String secondFile = "D://razrabotka_na_karantine//baza//orders3.txt";
        TxtParser.parseTxt(firstFile, secondFile);

/*        File myFile = new File("D://razrabotka_na_karantine//baza//orders.txt");
        FileReader phonesFile = new FileReader(myFile);
        Scanner scan = new Scanner(phonesFile);

        HashSet<String> notUniqPhones = new HashSet<>();

        while (scan.hasNextLine()) {
            notUniqPhones.add(scan.nextLine());
        }

        phonesFile.close();

        List listOfPhones = new CopyOnWriteArrayList(notUniqPhones);
        List<String> A = new ArrayList<>();

        listOfPhones.stream()
                .forEach((s) -> A.add(s.toString().substring(22, s.toString().indexOf("</Billing_Phone></Order>"))));

        List<String> B = A.stream()
                .filter(s -> s.startsWith("+375") && s.length() == 13)
                .toList();

        FileWriter nFile = new FileWriter("D://razrabotka_na_karantine//baza//orders3.txt");
        for(String s : B) {
            nFile.write(s+ "\n");
        }
        nFile.close();*/
    }
}
