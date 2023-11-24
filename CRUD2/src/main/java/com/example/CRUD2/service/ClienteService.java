package com.example.CRUD2.service;

import com.example.CRUD2.entity.Cliente;
import com.example.CRUD2.repository.ClienteRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;


    public List<Cliente>getCliente()
    {
        return clienteRepository.findAll();
    }

    public Cliente insertCliente(Cliente cliente)
    {
        Cliente clienteValid = clienteRepository.findById(cliente.getDni()).orElse(null);
        if (clienteValid == null)
        {
            return clienteRepository.save(cliente);
        }
        return null;
    }

    public void deleteCliente(int dni)
    {
        clienteRepository.deleteById(dni);
    }

    public Cliente updateCliente(Cliente cliente)
    {
        Cliente clienteUpdate = clienteRepository.findById(cliente.getDni()).orElse(null);
        if (clienteUpdate != null)
        {
            clienteUpdate.setNombre(cliente.getNombre());
            return clienteRepository.save(clienteUpdate);
        }
        return null;


    }

}
