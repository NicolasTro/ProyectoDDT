package com.example.ProyectoDDT.service.implementacion;


//import com.example.ProyectoDDT.entity.Cliente;
//import com.example.ProyectoDDT.repository.IEstadoRepository;
//import com.example.ProyectoDDT.service.IService;
import com.example.ProyectoDDT.entity.Cliente;
import com.example.ProyectoDDT.repository.IClienteRepository;
import com.example.ProyectoDDT.repository.IEstadoRepository;
import com.example.ProyectoDDT.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IService<Cliente> {


    private IClienteRepository clienteRepository;

    @Autowired
    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Cliente cliente) {

    }

    @Override
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
}
