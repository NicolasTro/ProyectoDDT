package com.example.ProyectoDDT.service.implementacion;

import com.example.ProyectoDDT.entity.Tercista;
import com.example.ProyectoDDT.service.IService;

import java.util.List;

public class TercistaService implements IService<Tercista> {
    @Override
    public Tercista guardar(Tercista tercista) {
        return null;
    }

    @Override
    public Tercista buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Tercista tercista) {

    }

    @Override
    public List<Tercista> listarTodos() {
        return List.of();
    }
}
