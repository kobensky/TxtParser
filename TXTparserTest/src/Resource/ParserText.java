package Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class ParserText {
    public static List<String> textParser (Set<String> setOfPhones, int startPhoneIndex, String endPhoneTagText, String phoneCode) {
        List<String> A = new ArrayList<>();

        setOfPhones.stream()
                .forEach((s) -> A.add(s.toString().substring(startPhoneIndex, s.toString().indexOf(endPhoneTagText))));

        List<String> B = A.stream()
                .filter(s -> s.startsWith(phoneCode) && s.length() == 13)
                .toList();
        return B;
    }
}
