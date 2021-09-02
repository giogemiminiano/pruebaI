package com.paquete.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paquete.demo.dao.RegistroMateria;
import com.paquete.demo.model.Calificacion;

@RestController
public class ControladorMateria {
	@Autowired
	private RegistroMateria registro;
	
	@PostMapping("/registrarCalificacion")
	public void guardaCalificacion(@RequestBody Calificacion materia) {
		registro.save(materia);
	}
	
	@DeleteMapping("/eliminaCalificacion/{calificacion}")
	public void eliminaCalificacion(@PathVariable int calificacion) {
		registro.deleteById(calificacion);
	}
	
	@PostMapping("/actualizaCalificacion")
	public void actualizaCalificacion(@PathVariable int calificacion,@PathVariable int id) {
		Calificacion tmp = registro.getById(id);
		tmp.calificacion = calificacion;
		registro.save(tmp);
	}
	
	@GetMapping("/mostrarCalificaciones")
	public List<Calificacion> mostrarCalificaciones(){
		return registro.findAll();
	}
	
	@GetMapping("/mostrarCalificacion/{alumno}")
	public List<Calificacion> mostrarCalificacion(@PathVariable int alumno){
		return registro.findByAlumno(alumno);
	}
}
