package pl.edu.wszib.strumienie.funkcyjny;

import pl.edu.wszib.strumienie.anonimowe.Car;

import java.util.function.Supplier;

public class DostawcaDomyslnychAut implements Supplier<Car> {
    @Override
    public Car get() {
        return new Car("domyslny", "domyslny", 100);
    }
}
