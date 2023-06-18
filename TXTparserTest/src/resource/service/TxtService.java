package resource.service;

import resource.Objects.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class TxtService {

    private static final int phoneLength = 13;

    private TxtService() {
        throw new IllegalStateException("Service class");
    }

/*    public static Set<String> putScanLinesToSet(Scanner scanner) {
        Set<String> phoneNumbersSet = new HashSet<>();
        while (scanner.hasNextLine()) {
            phoneNumbersSet.add(scanner.nextLine());
        }
        return phoneNumbersSet;
    }*/

    public static ArrayList<String> putScanLinesToList(Scanner scanner) {
        ArrayList<String> phoneNumbersList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            phoneNumbersList.add(scanner.nextLine());
        }
        return phoneNumbersList;
    }

    public static Order createNewOrder (String s) {
            String date = s.substring(19, 29);
            double cost = Double.parseDouble(s.substring(55, s.indexOf("</Order_Total>")));
            return new Order(date, cost);
    }
    public static String itemName1 (String s) {
        String rez = s.substring(67, s.indexOf("</Name>"));
        return rez;
    }
    public static String itemName2 (String s) {


            s.replaceAll("\"" , "");

        return s;
    }

/*    public static List<String> textParser(
            Set<String> setOfPhones,
            int startPhoneIndex,
            String endPhoneTagText,
            String phoneCode
    ) {
        return setOfPhones.stream()
                .map(phoneNumber -> phoneNumber.substring(startPhoneIndex, phoneNumber.indexOf(endPhoneTagText)))
                .filter(s -> s.startsWith(phoneCode) && s.length() == phoneLength)
                .collect(Collectors.toList());
    }*/
}
