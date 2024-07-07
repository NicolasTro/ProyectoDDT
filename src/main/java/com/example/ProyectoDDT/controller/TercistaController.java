package com.example.ProyectoDDT.controller;


import com.example.ProyectoDDT.entity.Tercista;
import com.example.ProyectoDDT.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/tercistas")
@CrossOrigin(origins = "http://localhost:5173")
public class TercistaController {

    private IService<Tercista> tercistaIService;

    @Autowired
    public TercistaController(IService<Tercista> tercistaIService) {
        this.tercistaIService = tercistaIService;
    }
@PostMapping("/registrar")
    public ResponseEntity guardar(@RequestBody Tercista tercista) {
        tercistaIService.guardar(tercista);
        log.info("tercista guardado");

        return new ResponseEntity(tercista, HttpStatus.CREATED);
    }

@GetMapping("/listar")
    public ResponseEntity listarTodos(){
    List<Tercista> listaTercistas = null;
    listaTercistas = tercistaIService.listarTodos();
    if(!listaTercistas.isEmpty()){
        return new ResponseEntity(listaTercistas, HttpStatus.FOUND);
    }else{
        return  new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}


}
