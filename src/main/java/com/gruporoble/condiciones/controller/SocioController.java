package com.gruporoble.condiciones.controller;

import com.gruporoble.condiciones.service.SocioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class SocioController {
    private SocioService socioService;

    @GetMapping("/viewSocios")
    public String viewSocios(Model model){
        model.addAttribute("socios",socioService.findAll());
        return "view-socios";
    }
}
