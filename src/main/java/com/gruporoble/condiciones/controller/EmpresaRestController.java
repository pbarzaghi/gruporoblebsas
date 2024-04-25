package com.gruporoble.condiciones.controller;

import com.gruporoble.condiciones.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EmpresaRestController {

     private EmpresaService empresaService;

    @GetMapping("/empresas")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.ok(empresaService.findAll());
    }



}
