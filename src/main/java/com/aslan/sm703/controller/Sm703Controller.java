package com.aslan.sm703.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sm703Controller {
    @RequestMapping("/")
    String welcome(Model model){
        model.addAttribute("message","Hello Spring!");
        return "index";
    }
}