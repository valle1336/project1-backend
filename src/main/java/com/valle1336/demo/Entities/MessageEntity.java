package com.valle1336.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MessageEntity {
    @Id
    private long id;
    private String message;
    private int phoneNumber;
    private String mail;
    private String name;

    public MessageEntity(long id, String message, int phoneNumber, String mail, String name) {
        this.id = id;
        this.message = message;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.name = name;
    }

    public MessageEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
