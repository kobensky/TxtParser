package resource.service;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TxtService {

    //TODO: добавить приватный конструктор



    public static Set<String> putScanLinesToSet(Scanner scanner) {
        Set<String> phoneNumbersSet = new HashSet<>();
        while (scanner.hasNextLine()) {
            phoneNumbersSet.add(scanner.nextLine());
        }
        return phoneNumbersSet;
    }

    public static List<String> textParser(
            Set<String> setOfPhones,
            int startPhoneIndex,
            String endPhoneTagText,
            String phoneCode
    ) {
        return setOfPhones.stream()
                .map(phoneNumber -> phoneNumber.substring(startPhoneIndex, phoneNumber.indexOf(endPhoneTagText)))
                .filter(s -> s.startsWith(phoneCode) && s.length() == 13)
                .collect(Collectors.toList());
    }
}
