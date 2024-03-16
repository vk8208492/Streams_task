package app.UserHadler;

import app.entity.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class UserHadler {

    public String handleData(List<User> list) {

        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();


        Stream<User> allData = list.stream();
        Stream<User> filteredData = allData.filter(user ->
                user.getEmail().contains("122"));

        filteredData.forEach(employee ->
                sb.append(count.getAndIncrement())
                        .append(") ").append(employee)
                        .append("\n"));

        return sb.toString();

    }
}
