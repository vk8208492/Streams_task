package app.UserRepository;

import app.entity.User;

import java.util.Arrays;
import java.util.List;

public class UserRepository {
    public List<User> getData() {
        return Arrays.asList(
                new User("Sergei", "ksv18061972@gmail.com"),
                new User("Natalia", "kne10091973@gmail.com"),
                new User("Vladyslav", "kvs280398@gmail.com"),
                new User("Anastasia", "aburlachka7@gmail.com"),
                new User("Artem", "kac25122012@gmail.com")
        );
    }
}
