package com.example.ProyectoDDT.service.implementacion;


import com.example.ProyectoDDT.entity.Articulo;
import com.example.ProyectoDDT.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArticuloService implements IService<Articulo> {

    @Override
    public Articulo guardar(Articulo articulo) {
        return null;
    }

    @Override
    public Articulo buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Articulo articulo) {

    }

    @Override
    public List<Articulo> listarTodos() {
        return List.of();
    }
}
