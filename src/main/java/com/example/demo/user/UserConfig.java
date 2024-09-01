package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User dida = new User(
                    "Dida",
                    LocalDate.of(2001, 7, 29),
                    "dida@ysn.nl"

            );

            User yaseen = new User(
                    "Yaseen",
                    LocalDate.of(1999, 1, 11),
                    "yaseen@dida.nl"

            );

            User marciano = new User(
                    "Marciano",
                    LocalDate.of(2002, 7, 29),
                    "marciaono@ysn.nl"

            );
            userRepository.saveAll(
                    List.of(dida, yaseen, marciano)
            );
        };
    }
}
