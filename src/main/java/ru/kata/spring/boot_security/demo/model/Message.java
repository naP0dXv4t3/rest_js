package ru.kata.spring.boot_security.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
    @Id
    private Long id;
    @Column(name = "senderEmail")
    private String senderEmail;
    @Column(name = "senderContact")
    private String senderContact;
    @Column(name = "messageText")
    private String messageText;

    public Message(){

    }
    public Message(Long id, String senderEmail, String senderContact, String messageText) {
        this.id = id;
        this.senderEmail = senderEmail;
        this.senderContact = senderContact;
        this.messageText = messageText;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderContact() {
        return senderContact;
    }

    public void setSenderContact(String senderContact) {
        this.senderContact = senderContact;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
