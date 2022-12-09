package pl.edu.wszib.strumienie.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<User> userBox = getUser("karol");

        /*if(userBox.isPresent()) {
            User user = userBox.get();
            System.out.println(user.getLogin());
            System.out.println(user.getPassword());
        }*/

        User user = userBox.orElse(new User("default", "default"));
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
    }

    public static Optional<User> getUser(String login) {
        if(login.equals("janusz")) {
            return Optional.of(new User("janusz", "janusz123"));
        }

        return Optional.empty();
    }
}
