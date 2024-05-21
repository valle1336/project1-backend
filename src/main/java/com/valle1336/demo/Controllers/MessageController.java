package com.valle1336.demo.Controllers;

import com.valle1336.demo.Entities.MessageEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class MessageController {
    @PostMapping("/sendMessage")
    public String sendMessage(@RequestBody MessageEntity message) {

    }
}
