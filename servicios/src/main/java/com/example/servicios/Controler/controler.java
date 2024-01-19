package com.example.servicios.Controler;

import com.example.servicios.Entity.Prestamo;
import com.example.servicios.Mapper.PrestamoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class controler {
    private PrestamoMapper prestamoMapper;
    public controler(PrestamoMapper prestamoMapper) {
        this.prestamoMapper = prestamoMapper;
    }

    @GetMapping("/findAll")
    public List<Prestamo> getAllPrestamo(){
        return prestamoMapper.findAllPrestamo();
    }

    @PostMapping("/updatePrestamo/{nro_prestamo}/{cantidad_Prestada}")
    public void updatePrestamo(@PathVariable int nro_prestamo, @PathVariable int cantidad_Prestada ){
        prestamoMapper.actualizarPrestamo(nro_prestamo,cantidad_Prestada);
    }

    @PostMapping("/insertPrestamo")
    public void insertPrestamo(@RequestBody Prestamo prestamo ){
        prestamoMapper.ingesarPrestamo(prestamo);
    }
}
