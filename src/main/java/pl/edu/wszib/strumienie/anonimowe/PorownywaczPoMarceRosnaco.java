package pl.edu.wszib.strumienie.anonimowe;

import java.util.Comparator;

public class PorownywaczPoMarceRosnaco implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
