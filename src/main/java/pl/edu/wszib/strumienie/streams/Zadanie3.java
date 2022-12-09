package pl.edu.wszib.strumienie.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Zadanie3 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mateusz");
        names.add("Janusz");
        names.add("Karol");
        names.add("Zbyszek");
        names.add("Wiesiek");
        names.add("Tomek");
        names.add("Piotrek");
        names.add("Bogdan");

        OptionalDouble doubleBox = names.stream()
                .filter(n -> !n.contains("a"))
                .peek(System.out::println)
                .mapToInt(String::length)
                .peek(System.out::println)
                .average();

        System.out.println(doubleBox.getAsDouble());
    }
}
