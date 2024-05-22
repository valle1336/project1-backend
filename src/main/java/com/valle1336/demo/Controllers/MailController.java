package com.valle1336.demo.Controllers;

import com.valle1336.demo.Entities.MailStructure;
import com.valle1336.demo.Entities.MessageEntity;
import com.valle1336.demo.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure structure) {
        mailService.sendMail(mail, structure);
        return "Mail sent";
    }
}
