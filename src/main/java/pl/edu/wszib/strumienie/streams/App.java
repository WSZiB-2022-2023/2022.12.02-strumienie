package pl.edu.wszib.strumienie.streams;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        List<String> filteredNumbers = numbers.stream()
                .filter(x -> x > 4)
                .filter(x -> x < 8)
                .peek(x -> System.out.println(x))
                .map(x -> "To jest liczba: " + x)
                .limit(2)
                .toList();

        filteredNumbers.stream().forEach(x -> System.out.println(x));
    }
}
