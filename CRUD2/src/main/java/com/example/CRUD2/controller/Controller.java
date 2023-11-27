package com.example.CRUD2.controller;

import com.example.CRUD2.entity.Cliente;
import com.example.CRUD2.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    ClienteService clienteService;
    @CrossOrigin(origins = "http://127.0.0.7:5500")
    @GetMapping("/a")
    public List<Cliente> getClientes()
    {
        return clienteService.getCliente();
    }

    @PostMapping("/c")
    public Cliente insertCliente(@RequestBody Cliente cliente)
    {
        return clienteService.insertCliente(cliente);
    }
    @DeleteMapping("/{dni}")
    public void deleteCliente(@PathVariable("dni") int dni)
    {
        clienteService.deleteCliente(dni);
    }

    @PostMapping("/u")
    public Cliente udpateCliente(@RequestBody Cliente cliente)
    {
        return clienteService.updateCliente(cliente);
    }

}
