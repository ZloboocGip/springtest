package ru.taiufun.springtest;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<String> getUsers() {

        return List.of(
                "Vitaly",
                "Artem",
                "Yarik"
        );
    }

    public List<String> test() {
        return getUsers();
    }
}