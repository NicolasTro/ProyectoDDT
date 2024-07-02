package com.example.ProyectoDDT.entity;


import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name="Estados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String estado;
    private String tipo;


}
