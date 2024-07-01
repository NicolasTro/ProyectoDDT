package com.example.ProyectoDDT.entity;

import java.util.List;

public class Empresa {

    private Integer Id;
    private String nombre;
    private Integer telefono;
    private String direccion;
    private String pais;
    private Integer codigoFiscal;
    private String email;
    private List<Trabajo> listaDeTrabajos;
}
