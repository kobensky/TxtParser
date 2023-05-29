package main;

import resource.FilesClosers;
import resource.FilesOpeners;
import resource.SaveListOfPhonesToFile;
import resource.service.TxtService;
import resource.util.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String firstFile = "D://razrabotka_na_karantine//baza//orders.txt";
        String secondFile = "D://razrabotka_na_karantine//baza//orders3.txt";
        Set<String> uniquePhones = FileUtils.read(firstFile);
        List<String> phoneList = TxtService.textParser(uniquePhones,
                22,
                "</Billing_Phone></Order>",
                "+375");
        FileWriter savedFile = FilesOpeners.openWriter(secondFile);
        SaveListOfPhonesToFile.saveListToFile(phoneList, savedFile);
        FilesClosers.writerCloser(savedFile);

    }
}
