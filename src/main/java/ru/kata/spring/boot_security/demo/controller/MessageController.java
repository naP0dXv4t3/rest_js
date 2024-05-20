package ru.kata.spring.boot_security.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.model.Message;
import ru.kata.spring.boot_security.demo.repository.MessageRepository;
import ru.kata.spring.boot_security.demo.service.MessageService;

import java.util.List;


@RestController
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    @GetMapping("/message-data")
    public ResponseEntity<List<Message>> showMessageDetails(){
        List<Message> messageList = messageService.findAll();
        return new ResponseEntity<>(messageList, HttpStatus.OK);
    }
    @PostMapping("/addMessage")
    public ResponseEntity<HttpStatus> addMessage(@RequestBody Message message){
        messageService.add(message);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}