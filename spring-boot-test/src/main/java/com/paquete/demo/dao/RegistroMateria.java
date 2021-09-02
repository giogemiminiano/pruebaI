package com.paquete.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paquete.demo.model.Calificacion;

public interface RegistroMateria extends JpaRepository<Calificacion,Integer>{

	List<Calificacion> findByAlumno(int alumno);

}
