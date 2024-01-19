package com.example.servicios;

import com.example.servicios.Entity.Prestamo;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Prestamo.class)
@MapperScan("com.example.servicios.Mapper")
@SpringBootApplication
public class ServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosApplication.class, args);
	}

}
