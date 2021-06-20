package com.aslan.sm703.controller;

import com.aslan.sm703.Sum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sm703Controller {

    @GetMapping("/add")
    String page1 (Model model){
        model.addAttribute("sum", new Sum());
        return "add/form";
    }

    @PostMapping("/add")
    String page2 (@ModelAttribute Sum sum, Model model){
        model.addAttribute("sum", sum);
        return "add/result";
    }
}
