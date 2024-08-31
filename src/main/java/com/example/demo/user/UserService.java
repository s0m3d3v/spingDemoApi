package com.example.demo.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Dida",
                        LocalDate.of(2001, 7, 29),
                        "dida@ysn.nl"

                )
        );
    }
}
