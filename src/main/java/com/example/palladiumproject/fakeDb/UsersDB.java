package com.example.palladiumproject.fakeDb;

import com.example.palladiumproject.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDB {
    public static List<User> users = new ArrayList<>();
    public static List<User> usersDB() {
        users.addAll(
                List.of(
                        new User("John68", "John Mclein",
                                "john@gmail.com", "+2348143016868"),
                        new User("SandraOh", "Sandra Oh",
                                "sandra@gmail.com", "+2348148116868"),
                        new User("Leena", "Leena Jackie",
                                "lena@gmail.com", "+2348147816868"),
                        new User("AjalaThom", "Ajala Thompson",
                                "john@gmail.com", "+2348143016868"),
                        new User("Ogbonnaya", "Vickie Ogbonnaya",
                                "olive.ola@gmail.com", "+2348143019968")
                )
        );
        return users;
    }


}
