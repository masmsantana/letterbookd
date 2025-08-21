package com.github.iarlo.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivrariaController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "iarlo");
        return "index";
    }
}
