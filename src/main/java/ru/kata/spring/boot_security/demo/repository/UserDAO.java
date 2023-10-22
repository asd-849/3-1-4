package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserDAO {
    //    @Query("select u from User u join fetch u.roles where u.username = :username")
//    User findByUsername(String username);
    void deleteById(Long id);
    List<User> findAll();
    void save(User user);
    User findById(Long id);
    User findByUsername(String username);
}