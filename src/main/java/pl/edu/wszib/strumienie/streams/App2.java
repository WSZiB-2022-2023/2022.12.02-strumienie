package pl.edu.wszib.strumienie.streams;

import java.util.List;
import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        List<Integer> ints = new Random()
                .ints(100, 0 , 100)
                .boxed().toList();

        int sum = ints.stream().parallel().peek(System.out::println).reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
