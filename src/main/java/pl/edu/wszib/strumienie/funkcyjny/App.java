package pl.edu.wszib.strumienie.funkcyjny;

import pl.edu.wszib.strumienie.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "To jest liczba: " + i;

        String wynik = function.apply(7);
        System.out.println(wynik);
        System.out.println(function.apply(10));
        System.out.println(function.apply(15));

        BiFunction<Integer, Double, String> biFunction =
                (intidzer, dabyl) -> "Polaczone liczby: " + (intidzer + dabyl);

        System.out.println(biFunction.apply(3, 5.5));
        System.out.println(biFunction.apply(6, 4.14));

        UnaryOperator<Integer> unaryOperator = i -> i * 4;

        System.out.println(unaryOperator.apply(5));
        System.out.println(unaryOperator.apply(10));

        Predicate<String> predicate = s -> s.contains("abc");

        System.out.println(predicate.test("abcd"));
        System.out.println(predicate.test("klhjasdfabckljghdflk"));
        System.out.println(predicate.test("xyz"));

        Supplier<Car> supplier = () -> new Car("default", "default", 0);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<Car> consumer = car -> System.out.println(car);

        consumer.accept(new Car("BMW", "3", 200));
        consumer.accept(supplier.get());

        DostawcaDomyslnychAut d = new DostawcaDomyslnychAut();
        System.out.println(d.get());

        Supplier<Car> supplier2 = new DostawcaDomyslnychAut();
        System.out.println(supplier2.get());

        BiFunction<Integer, Boolean, Double> biFunction2 = (i, b) -> {
            if(b) {
                return i * 3.3;
            } else {
                return i * 5.8;
            }
        };

        System.out.println(biFunction2.apply(4, true));
        System.out.println(biFunction2.apply(4, false));

        JakisInterfejs ji = new JakisInterfejs() {
            @Override
            public int a() {
                return 4;
            }

            @Override
            public void b() {
                System.out.println(a());
            }
        };
    }

    public static void f() {
        System.out.println("funkcja !!");
    }
}
