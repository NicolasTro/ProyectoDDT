package com.example.ProyectoDDT.service.implementacion;

import com.example.ProyectoDDT.entity.Trabajo;
import com.example.ProyectoDDT.service.IService;

import java.util.List;

public class TrabajoService implements IService<Trabajo> {
    @Override
    public Trabajo guardar(Trabajo trabajo) {
        return null;
    }

    @Override
    public Trabajo buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Trabajo trabajo) {

    }

    @Override
    public List<Trabajo> listarTodos() {
        return List.of();
    }
}
