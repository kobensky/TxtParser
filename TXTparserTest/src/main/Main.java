package main;

import resource.parsInterface.*;
import resource.util.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<ParseFuncInterface> getAllParsers() {
        List<ParseFuncInterface> list = new ArrayList<>();
        list.add(new SubstrMyScore());
        list.add(new SubstrName());
        list.add(new SubstrTimeDuration());
        list.add(new SubstrTotalScore());
        return list;
    }

    public static void main(String[] args) {
        String firstFile = "D://razrabotka_na_karantine//baza//films.txt";
        String secondFile = "D://razrabotka_na_karantine//baza//films2.txt";

        List<String> uniqueStrings = FileUtils.read(firstFile);

        List<String> allNesStrings = uniqueStrings.stream()
                .filter(s-> s.contains("nameRus") || s.contains("<b>") || s.contains("мин")
                || s.contains("удалить оценку"))
                .map(String::trim)
                .toList();

        List<String> newNormString = new ArrayList<>();


        List<ParseFuncInterface> list = getAllParsers();
        allNesStrings.forEach(s-> {
                    StringBuilder sb = new StringBuilder();
                    list.forEach(k-> k.substringMeth(s, sb));
                    newNormString.add(sb.toString());
                });
/*        for(String s : allNesStrings) {
            if(s.contains("nameRus")) {
                String z1= s.substring(s.indexOf("/\">")+3,s.indexOf("</a>"));
                newNormString.add(z1);
                continue;
            }
            if(s.contains("<b>")) {
                String z2=s.substring(s.indexOf("<b>") + 3, s.indexOf("</b>"));
                newNormString.add(z2);
                continue;
            }
            if(s.contains("мин")) {
                String z3=s.substring(s.indexOf("y\">") + 3, s.indexOf(" мин"));
                newNormString.add(z3);
                continue;
            }
            if(s.contains("удалить оценку")) {
                String z4=s.substring(s.indexOf("show();\">") + 9, s.indexOf("</div><div class="));
                newNormString.add(z4);
                continue;
            }
        }*/
        newNormString.forEach(System.out::println);
/*        FileUtils.write(secondFile, newNormString);*/
/*
        ArrayList<String> itemsNames = new ArrayList<>();
        for(String s : uniqueStrings) {

            itemsNames.add(s.replaceAll("\"" , ""));
        }

        HashMap<String, Integer> itemsValue = new HashMap<>();
        for(String s: itemsNames) {
            itemsValue.merge(s, 1, (Integer::sum));
        }
*/

/*        itemsValue.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);*/


/*        for(String s : uniqueStrings) {
            itemsNames.add(TxtService.itemName2(s));
        }*/
/*        for(String s : itemsNames) {
            System.out.println(s);
        }*/
/*        ArrayList<Order> orders = new ArrayList<>();
        for(String s: uniqueStrings) {
            orders.add(TxtService.createNewOrder(s));
        }*/

/*        double rez = 0;
        int i = 0;
        for(Order o : orders) {
            if(o.getDate().contains("/05/2023")) {
                i++;
                rez = rez + o.getTotalPrice();
            }
        }
        System.out.println(rez);*/

/*        for(Order o : orders) {
            System.out.println(o);
        }*/
        /*Set<String> uniquePhones = FileUtils.read(firstFile);*/
/*        List<String> phoneList = TxtService.textParser(uniquePhones,
                22,
                "</Billing_Phone></Order>",
                "+375");*/
/*        FileUtils.write(secondFile, phoneList);*/

    }
}
