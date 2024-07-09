package com.example.ProyectoDDT.controller;

import com.example.ProyectoDDT.entity.Articulo;
import com.example.ProyectoDDT.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articulos")
@Slf4j
@CrossOrigin(origins = "http://localhost:5173")
public class ArticuloController {

    private IService<Articulo> articuloIService;

    @Autowired
    public ArticuloController(IService<Articulo> articuloIService) {
        this.articuloIService = articuloIService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<Articulo> guardar(@RequestBody Articulo articulo) {
        articuloIService.guardar(articulo);
        return new ResponseEntity(articulo, HttpStatus.CREATED);
    }






}
