package pl.edu.wszib.strumienie.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    //public static int sortType = 1;

    public static void main(String[] args) {
        /*List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(0);
        numbers.add(10);
        numbers.add(2);
        numbers.add(7);
        numbers.add(3);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);*/

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 300));
        cars.add(new Car("Toyota", "Corolla", 200));
        cars.add(new Car("Audi", "A3", 220));
        cars.add(new Car("Kia", "Ceed", 150));
        cars.add(new Car("Citroen", "C3", 120));

        System.out.println(cars);
        Collections.sort(cars, new Comparator<>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        /*Comparator<Car> c1 = new Comparator<>() {

            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        };

        Comparator<Car> c2 = new Comparator<>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };*/
        System.out.println(cars);
        //sortType = 2;
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        System.out.println(cars);
        //sortType = 5;
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getBrand().compareTo(o1.getBrand());
            }
        });
        System.out.println(cars);

        List<Integer> list = List.of(1,3,6,87);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        list2.add(7);

        List<Integer> list3 = List.copyOf(list2);
        //list3.add(34);
    }
}
