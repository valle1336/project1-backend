package com.valle1336.demo.Service;

import com.valle1336.demo.Entities.MailStructure;
import com.valle1336.demo.Entities.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String toMail;


    public void sendMail(MessageEntity message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        String mailText = String.format("Namn: %s\nTelefon: %s\nE-post: %s\nMeddelande: %s",
                message.getName(),
                message.getPhoneNumber(),
                message.getMail(),
                message.getMessage());


        simpleMailMessage.setFrom(message.getMail());
        simpleMailMessage.setSubject(message.getSubject());
        simpleMailMessage.setText(mailText);
        simpleMailMessage.setTo(toMail);

        mailSender.send(simpleMailMessage);
    }

}
