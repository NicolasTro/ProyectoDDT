package com.example.ProyectoDDT.controller;

import com.example.ProyectoDDT.entity.Articulo;
import com.example.ProyectoDDT.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articulos")
@Slf4j
public class ArticuloController {

    private IService<Articulo> articuloIService;




}
