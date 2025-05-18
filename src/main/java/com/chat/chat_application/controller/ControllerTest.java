package com.chat.chat_application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zidi")
public class ControllerTest {

    @RequestMapping("/test")
    public String test(){
        return "Hello";
    }

}
