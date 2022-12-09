package pl.edu.wszib.strumienie.streams;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("asdf asdf");
        strings.add("asdFasdFA");
        strings.add("asdf.dfasd.d");
        strings.add("fdsg,sdf");
        strings.add("fdsg sdf,asd");
        strings.add("fdsg.asdf,asdf,asd");
        strings.add("asdf,asdf.FasdF");
        strings.add("asdf GA asd ASDF");
        strings.add("lkjashdlkjas");

        /*for(String string : strings) {
            if(!string.contains(" ") && string.toLowerCase().equals(string)) {
                String stringWithoutDot = string.replaceAll("\\.", "");
                String stringWithoutSemicolon = stringWithoutDot
                        .replaceAll(",", "");
                System.out.println(stringWithoutSemicolon);
            }
        }*/

        strings.stream()
                .filter(s -> !s.contains(" "))
                .filter(s -> s.toLowerCase().equals(s))
                .map(s -> s.replaceAll("\\.", ""))
                .map(s -> s.replaceAll(",", ""))
                .forEach(System.out::println);
    }
}
