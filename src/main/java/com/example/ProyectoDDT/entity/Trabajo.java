package com.example.ProyectoDDT.entity;




import jakarta.persistence.*;
import lombok.*;

//import javax.persistence.*;

@Entity
@Table(name = "Trabajos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tercista_id")
    private Tercista tercista;
}
