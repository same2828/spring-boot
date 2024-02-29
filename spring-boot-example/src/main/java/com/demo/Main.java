// src/main/java/com/demo/Main.java
package com.demo;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/api")
public class Main {
  private List<User> users = new ArrayList<>();

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @GetMapping("/hello")
  public User hello() {
    return new User("Sam", 22, List.of("Java", "TypeScript", "Go"));
  }

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return users;
  }

  @PostMapping("/users/create")
  public void createUser(@RequestBody User user) {
    users.add(user);
  }

  record User(String name, int age, List<String> skills) {}
}
