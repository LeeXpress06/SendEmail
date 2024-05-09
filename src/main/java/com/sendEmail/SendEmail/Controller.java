package com.sendEmail.SendEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceMail serviceMail;

    public Controller(ServiceMail serviceMail) {
        this.serviceMail = serviceMail;
    }

    @GetMapping("sendMail")
    public String sendEmailcontroller( ){

        serviceMail.sendMail("shiblee006@gmail.com", "This is test", "Life test");

        return " Send succesfully";
    }






}
