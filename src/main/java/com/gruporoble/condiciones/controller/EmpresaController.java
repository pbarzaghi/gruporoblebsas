package com.gruporoble.condiciones.controller;

import com.gruporoble.condiciones.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller

public class EmpresaController {
    private EmpresaService empresaService;

    @GetMapping("/viewEmpresas")
    public String viewEmpresas(Model model){
        model.addAttribute("empresas",empresaService.findAll());
        return "view-empresas";
    }





}
