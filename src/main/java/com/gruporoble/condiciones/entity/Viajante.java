package com.gruporoble.condiciones.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
 @Entity
 @Table(name="viajante")
public class Viajante {
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    private String nombreCompleto;
    private String nroCelular;
    private String email;
    //private List<Empresa> empresas;

}
