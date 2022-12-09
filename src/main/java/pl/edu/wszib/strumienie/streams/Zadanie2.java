package pl.edu.wszib.strumienie.streams;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Janusz", "Kowalski", 3000, Employee.Position.LOW));
        employees.add(new Employee(2, "Zbyszek", "Kowalski", 3300, Employee.Position.LOW));
        employees.add(new Employee(3, "Wiesiek", "Kowalski", 3600, Employee.Position.LOW));
        employees.add(new Employee(4, "Karol", "Kowalski", 3900, Employee.Position.MID));
        employees.add(new Employee(5, "Bogdan", "Kowalski", 4200, Employee.Position.MID));
        employees.add(new Employee(6, "Rysiek", "Kowalski", 4500, Employee.Position.LOW));
        employees.add(new Employee(7, "Zdzisiek", "Kowalski", 4800, Employee.Position.HIGH));
        employees.add(new Employee(8, "Mateusz", "Kowalski", 5100, Employee.Position.MID));
        employees.add(new Employee(9, "Robert", "Kowalski", 5400, Employee.Position.HIGH));

        /*employees.stream()
                .peek(e -> e.setSalary(5000))
                //.map(e -> new Employee(e.getId(), e.getName(), e.getSurname(), 5000, e.getPosition()))
                .forEach(System.out::println);

        System.out.println(employees);*/

        employees.stream()
                .filter(e -> e.getPosition() == Employee.Position.MID)
                .filter(e -> e.getSalary() >= 4000)
                .filter(e -> e.getSalary() <= 5000)
                .peek(e -> e.setSalary(4800))
                .forEach(e -> System.out.println(e.getId()));

        System.out.println(employees);
    }
}
