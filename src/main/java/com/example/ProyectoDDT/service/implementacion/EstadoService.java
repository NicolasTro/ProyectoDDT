package com.example.ProyectoDDT.service.implementacion;

import com.example.ProyectoDDT.entity.Estado;
import com.example.ProyectoDDT.repository.IEstadoRepository;
import com.example.ProyectoDDT.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstadoService implements IService<Estado> {


    private IEstadoRepository estadoRepository;

    @Autowired
    public EstadoService(IEstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public Estado guardar(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public Estado buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Estado estado) {

    }

    @Override
    public List<Estado> listarTodos() {
        return List.of();
    }
}
