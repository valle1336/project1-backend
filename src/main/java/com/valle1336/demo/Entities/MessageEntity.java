package com.valle1336.demo.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "message_Table")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;
    private String phoneNumber;
    private String mail;
    private String name;
    private LocalDateTime creationDate;

    public MessageEntity(long id, String message, String phoneNumber, String mail, String name, LocalDateTime creationDate) {
        this.id = id;
        this.message = message;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.name = name;
        this.creationDate = creationDate;
    }

    public MessageEntity() {
    }

}
