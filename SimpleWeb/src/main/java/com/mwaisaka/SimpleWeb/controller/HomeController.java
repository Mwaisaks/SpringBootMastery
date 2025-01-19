package com.mwaisaka.SimpleWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to Mwaisaka's cult :)";
    }

    @RequestMapping("/about")
    public String about(){
        return "Make your self comfortable my dearest :)";
    }
}

/*
or you could use @Controller and a combination of @RequestMapping and @RequestBody
 */