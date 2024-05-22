package com.valle1336.demo.Controllers;

import com.valle1336.demo.Entities.MailStructure;
import com.valle1336.demo.Entities.MessageEntity;
import com.valle1336.demo.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send")
    public String sendMail(@RequestBody MessageEntity message) {
        MessageEntity newMessage = new MessageEntity();
        newMessage.setMessage(message.getMessage());
        newMessage.setMail(message.getMail());
        newMessage.setName(message.getName());
        newMessage.setPhoneNumber(message.getPhoneNumber());
        newMessage.setSubject(message.getSubject());
        newMessage.setCreationDate(LocalDateTime.now());

        mailService.sendMail(newMessage);
        return "Mail sent";
    }
}
