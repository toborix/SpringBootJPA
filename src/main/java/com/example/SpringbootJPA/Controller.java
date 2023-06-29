package com.example.SpringbootJPA;

import com.example.SpringbootJPA.db_setup.persistance.UserEntity;
import com.example.SpringbootJPA.db_setup.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    UserRepository userRepository;

    @Autowired
    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getUserByName(@RequestParam String name) {

        UserEntity user = userRepository.findByName(name);

        return user.toString();
    }
}
