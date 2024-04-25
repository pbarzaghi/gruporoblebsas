package com.gruporoble.condiciones.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Socios {
    private Long id;
    private String localidad;
    private String nombreContacto;
    private String nombreFantasia;
    private String cuit;
    private String telContacto;
    private String direccion;
    private String email;



}
