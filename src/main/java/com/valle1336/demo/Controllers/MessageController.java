package com.valle1336.demo.Controllers;

import com.valle1336.demo.Entities.MessageEntity;
import com.valle1336.demo.Repositories.MessageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MessageController {
    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @PostMapping("/sendMessage")
    public ResponseEntity<MessageEntity> sendMessage(@RequestBody MessageEntity message) {
        MessageEntity newMessage = new MessageEntity();
        newMessage.setMessage(message.getMessage());
        newMessage.setMail(message.getMail());
        newMessage.setName(message.getName());
        newMessage.setPhoneNumber(message.getPhoneNumber());
        newMessage.setCreationDate(LocalDateTime.now());

        MessageEntity saveMessage = messageRepository.save(newMessage);

        return new ResponseEntity<MessageEntity>(saveMessage, HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public List<MessageEntity> allMessages() {
        return messageRepository.findAll();
    }
}
