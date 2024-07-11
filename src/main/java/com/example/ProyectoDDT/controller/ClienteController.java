package com.example.ProyectoDDT.controller;


//import com.example.ProyectoDDT.entity.Cliente;

import com.example.ProyectoDDT.entity.Cliente;
import com.example.ProyectoDDT.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@Slf4j
@CrossOrigin(origins = "http://localhost:5173")
public class ClienteController {

    private IService<Cliente> clienteIService;

    @Autowired
    public ClienteController(IService<Cliente> clienteIService) {
        this.clienteIService = clienteIService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<Cliente> guardar(@RequestBody Cliente cliente) {

        clienteIService.guardar(cliente);
        log.info("cliente guardado");

        return new ResponseEntity(cliente, HttpStatus.CREATED);
    }


    @GetMapping("/listar")
    public ResponseEntity<Cliente> listarTodos() {
        List<Cliente> listaClientes = null;
        listaClientes = clienteIService.listarTodos();
        if (!listaClientes.isEmpty()) {


            return new ResponseEntity(listaClientes, HttpStatus.FOUND);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }


    }


}
