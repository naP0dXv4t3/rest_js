package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Message;

import java.util.List;

public interface MessageService {

    void add(Message message);
    List<Message> findAll();

}
