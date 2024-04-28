package com.gruporoble.condiciones.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDto {
    private Long id;
     private String nombre;
    private String cuit;
    private String tel;
}
