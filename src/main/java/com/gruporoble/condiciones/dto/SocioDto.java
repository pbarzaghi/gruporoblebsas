package com.gruporoble.condiciones.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocioDto {
    private Long id;
    private String localidad;

    private String nombreFantasia;

    private String telContacto;
    private String email;
    private String cuit;

}
