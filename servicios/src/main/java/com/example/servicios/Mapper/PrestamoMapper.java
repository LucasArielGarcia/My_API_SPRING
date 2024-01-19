package com.example.servicios.Mapper;

import com.example.servicios.Entity.Prestamo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PrestamoMapper {
    @Select("select * from Prestamo")
    List<Prestamo> findAllPrestamo();

    @Update("UPDATE Prestamo SET CANT_PRESTADA = #{cantidad_Prestada} WHERE NRO_PRESTAMO = #{nro_prestamo}")
    void actualizarPrestamo(int nro_prestamo,int cantidad_Prestada);

    @Insert("INSERT INTO PRESTAMO (CANT_PRESTADA, CUOTAS, PRECIO_CUOTAS, DNI, FECHA_EMISION, INTERES, CANTIDAD_TOTAL) VALUE (#{CANT_PRESTADA},#{CUOTAS},#{PRECIO_CUOTAS},#{DNI},#{FECHA_EMISION},#{INTERES},#{CANTIDAD_TOTAL});")
    void ingesarPrestamo(Prestamo Prestamo);
}
