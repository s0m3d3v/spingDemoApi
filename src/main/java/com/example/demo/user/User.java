package com.example.demo.user;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")  // Change this to avoid the reserved keyword
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;
    private String name;
    private LocalDate birthday;
    private String email;

    public User() {
    }

    public User(long id,
                String name,
                LocalDate birthday,
                String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public User(String name,
                LocalDate birthday,
                String email) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public User(long l, String dida, LocalDate of, String mail, Object o) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }
}
