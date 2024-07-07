package com.example.ProyectoDDT.service.implementacion;

import com.example.ProyectoDDT.entity.Tercista;
import com.example.ProyectoDDT.repository.IEstadoRepository;
import com.example.ProyectoDDT.repository.ITercistaRepository;
import com.example.ProyectoDDT.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TercistaService implements IService<Tercista> {


    private ITercistaRepository tercistaRepository;

    @Autowired
    public TercistaService(ITercistaRepository tercistaRepository) {
        this.tercistaRepository = tercistaRepository;
    }


    @Override
    public Tercista guardar(Tercista tercista) {
        return tercistaRepository.save(tercista);
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
        return tercistaRepository.findAll();
    }
}
