package com.gruporoble.condiciones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/viewQuienesSomos")
    public String viewQuienessomos(Model model){
            return "view-quienessomos";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
