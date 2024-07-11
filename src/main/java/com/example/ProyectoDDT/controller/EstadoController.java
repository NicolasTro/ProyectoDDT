package com.example.ProyectoDDT.controller;


import com.example.ProyectoDDT.entity.Estado;
import com.example.ProyectoDDT.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
@Slf4j
@CrossOrigin(origins = "http://localhost:5173")
public class EstadoController {

    private IService<Estado> estadoIService;

    @Autowired
    public EstadoController(IService<Estado> estadoIService) {
        this.estadoIService = estadoIService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<Estado> guardar(@RequestBody Estado estado) {

        estadoIService.guardar(estado);
        log.info("estado Guardado");

        return new ResponseEntity(estado, HttpStatus.CREATED);
    }


    @GetMapping("/listar")
    public ResponseEntity<Estado> listarTodos() {
        List<Estado> listaEstados = null;
        listaEstados = estadoIService.listarTodos();
        if (!listaEstados.isEmpty()) {
            return new ResponseEntity(listaEstados, HttpStatus.FOUND);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
