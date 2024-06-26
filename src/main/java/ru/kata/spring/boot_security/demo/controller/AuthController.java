package ru.kata.spring.boot_security.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.model.Message;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.MessageRepository;
import ru.kata.spring.boot_security.demo.security.PersonDetails;

import java.util.List;


@RestController
public class AuthController {

    @GetMapping("/user-data")
    public ResponseEntity<User> showUserDetails(Authentication authentication) {
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        return new ResponseEntity<>(personDetails.getUser(), HttpStatus.OK);
    }
}
