package com.lefevre.mathis.first.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/hello/{name}")
    public String ping(@PathVariable String name,@RequestParam(required = false) Integer age) {
        if(age==null){return "Bien le bonjour " + name + "tu n'as pas d'age";}
        return "Bien le bonjour " + name + " tu as " + age +"ans";
    }
}