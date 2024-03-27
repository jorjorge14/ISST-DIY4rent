package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Martass");
        return "hello";
    }

    @GetMapping("/mytools")
    public String myTools() {
        return "mytools"; 
    }

    @GetMapping("/publish")
    public String publish() {
        return "publish"; 
    }
}
