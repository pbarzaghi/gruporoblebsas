package com.gruporoble.condiciones.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
 @Table(name="empresa")
public class Empresa {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String cuit;
    private String tel;
   /* private List<Viajante> viajantes;
    private List<ContratoComercial> contratoComerciales;
    private byte[] logo;
*/

}
