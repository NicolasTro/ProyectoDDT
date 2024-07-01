package com.example.ProyectoDDT.entity;


//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;
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
