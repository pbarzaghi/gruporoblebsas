package com.gruporoble.condiciones.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="socio")

public class Socio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String localidad;
  //  private String nombreContacto;
    private String nombreFantasia;
    private String cuit;
    private String telContacto;
  //  private String direccion;
  //  private String email;



}
