package com.example.servingwebcontent.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@org.springframework.stereotype.Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        model.put("Some", "hello, letsCode!");
        return "main";
    }

}
