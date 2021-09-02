package com.paquete.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paquete.demo.model.Alumno;

public interface RegistroAlumno extends JpaRepository<Alumno,Integer>{

}
