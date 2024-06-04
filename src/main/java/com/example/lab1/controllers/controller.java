package com.example.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
public class controller {
    @GetMapping("/")
    public String home(Model model) {

        String title = "Dota 2 Heroes";
        String subtitle = "Top Heroes";

        Map<String, String> heroRoles = new HashMap<>();
        heroRoles.put("Invoker", "Mid");
        heroRoles.put("Pudge", "Support");
        heroRoles.put("Axe", "Offlane");

        List<String> heroes = Arrays.asList("Invoker", "Pudge", "Axe");

        String localizedText = "Welcome to the Dota 2 Universe!";

        String selectedHero = "Invoker";

        String heroLink = "https://www.dota2.com/hero/invoker";

        String heroQuote = "I am a beacon of knowledge blazing out across a black sea of ignorance.";

        boolean showSpecialMessage = true;

        model.addAttribute("title", title);
        model.addAttribute("subtitle", subtitle);
        model.addAttribute("heroRoles", heroRoles);
        model.addAttribute("heroes", heroes);
        model.addAttribute("localizedText", localizedText);
        model.addAttribute("selectedHero", selectedHero);
        model.addAttribute("heroLink", heroLink);
        model.addAttribute("heroQuote", heroQuote);
        model.addAttribute("showSpecialMessage", showSpecialMessage);

        return "index";
    }
}
