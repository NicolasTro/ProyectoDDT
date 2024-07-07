package com.example.ProyectoDDT.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String nombre;
    private String pais;
    private String email;
    private Integer telefono;
    private String direccion;

}
