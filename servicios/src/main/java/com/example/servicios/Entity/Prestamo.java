package com.example.servicios.Entity;

import java.util.Date;

public class Prestamo {

    private Integer NRO_PRESTAMO;
    private Integer CANT_PRESTADA;
    private Integer CUOTAS;
    private Integer PRECIO_CUOTAS;
    private Integer DNI;
    private Date FECHA_EMISION;
    private Integer INTERES;
    private Integer CANTIDAD_TOTAL;

    public Integer getNRO_PRESTAMO() {
        return NRO_PRESTAMO;
    }

    public void setNRO_PRESTAMO(Integer NRO_PRESTAMO) {
        this.NRO_PRESTAMO = NRO_PRESTAMO;
    }

    public Integer getCANT_PRESTADA() {
        return CANT_PRESTADA;
    }

    public void setCANT_PRESTADA(Integer CANT_PRESTADA) {
        this.CANT_PRESTADA = CANT_PRESTADA;
    }

    public Integer getCUOTAS() {
        return CUOTAS;
    }

    public void setCUOTAS(Integer CUOTAS) {
        this.CUOTAS = CUOTAS;
    }

    public Integer getPRECIO_CUOTAS() {
        return PRECIO_CUOTAS;
    }

    public void setPRECIO_CUOTAS(Integer PRECIO_CUOTAS) {
        this.PRECIO_CUOTAS = PRECIO_CUOTAS;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getFECHA_EMISION() {
        return FECHA_EMISION;
    }

    public void setFECHA_EMISION(Date FECHA_EMISION) {
        this.FECHA_EMISION = FECHA_EMISION;
    }

    public Integer getINTERES() {
        return INTERES;
    }

    public void setINTERES(Integer INTERES) {
        this.INTERES = INTERES;
    }

    public Integer getCANTIDAD_TOTAL() {
        return CANTIDAD_TOTAL;
    }

    public void setCANTIDAD_TOTAL(Integer CANTIDAD_TOTAL) {
        this.CANTIDAD_TOTAL = CANTIDAD_TOTAL;
    }


    public Prestamo(Integer NRO_PRESTAMO, Integer CANT_PRESTADA, Integer CUOTAS, Integer PRECIO_CUOTAS, Integer DNI, Date FECHA_EMISION, Integer INTERES, Integer CANTIDAD_TOTAL) {
        this.NRO_PRESTAMO = NRO_PRESTAMO;
        this.CANT_PRESTADA = CANT_PRESTADA;
        this.CUOTAS = CUOTAS;
        this.PRECIO_CUOTAS = PRECIO_CUOTAS;
        this.DNI = DNI;
        this.FECHA_EMISION = FECHA_EMISION;
        this.INTERES = INTERES;
        this.CANTIDAD_TOTAL = CANTIDAD_TOTAL;
    }
}
