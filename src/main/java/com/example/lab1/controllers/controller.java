package com.example.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class controller {
    @GetMapping("/")
    public String home(Model model) {
        String message = "Hello, Thymeleaf!";
        List<String> items = Arrays.asList("Axe", "Crystal Maiden", "Storm Spirit");

        model.addAttribute("message", message);
        model.addAttribute("items", items);

        return "index";
    }
}
