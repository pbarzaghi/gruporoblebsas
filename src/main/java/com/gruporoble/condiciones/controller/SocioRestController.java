package com.gruporoble.condiciones.controller;

import com.gruporoble.condiciones.service.SocioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SocioRestController {

    private SocioService socioService;
    @GetMapping("/socios")
    public ResponseEntity<?> findAllSocios() {
        return ResponseEntity.ok(socioService.findAll());
    }


}
