package com.example.ProyectoDDT.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Articulos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String nombre;
    private String descripcion;
    private Double cantidad;
    private String unidad;
    private Integer codigoDeTrazabilidad; // LOTE-ESTADO-CLASIFICACION-ESPESOR

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estado_id")
    private Estado estado;

    private Double precioBase;
}
