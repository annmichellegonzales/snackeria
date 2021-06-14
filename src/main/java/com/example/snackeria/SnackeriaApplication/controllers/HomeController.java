package com.example.snackeria.SnackeriaApplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String homepage() {
        return "app/home";
    }

}
