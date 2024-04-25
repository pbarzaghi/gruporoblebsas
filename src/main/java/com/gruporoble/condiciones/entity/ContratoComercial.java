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
@Table(name="contrato_comercial")
public class ContratoComercial {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
   // private Empresa empresa;
    private byte[] listaPrecios;
    private String extensionListaPrecios;
    private byte[] condicionesPago;
    private String extensionCondicionesPago;
}
