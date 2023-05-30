package main;

import resource.service.TxtService;
import resource.util.FileUtils;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String firstFile = "D://razrabotka_na_karantine//baza//orders.txt";
        String secondFile = "D://razrabotka_na_karantine//baza//orders3.txt";
        Set<String> uniquePhones = FileUtils.read(firstFile);
        List<String> phoneList = TxtService.textParser(uniquePhones,
                22,
                "</Billing_Phone></Order>",
                "+375");
        FileUtils.write(secondFile, phoneList);
    }
}
