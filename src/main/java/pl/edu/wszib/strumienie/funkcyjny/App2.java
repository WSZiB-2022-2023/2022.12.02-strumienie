package pl.edu.wszib.strumienie.funkcyjny;

import java.util.function.Consumer;

public class App2 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9};
        skonsumujLiczby(tab, i -> System.out.println(i));
        skonsumujLiczby(tab, i -> System.out.println("Liczba: " + i));

    }

    public static void skonsumujLiczby(int[] tab, Consumer<Integer> consumer) {
        for(int element : tab) {
            consumer.accept(element);
        }
    }
}
