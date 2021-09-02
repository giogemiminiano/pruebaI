package com.paquete.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paquete.demo.dao.RegistroAlumno;
import com.paquete.demo.model.Alumno;

@RestController
public class ControladorAlumno {
	@Autowired
	private RegistroAlumno registro;
	
	@PostMapping("/registrarAlumno")
	public String guardaAlumno(@RequestBody Alumno alumno) {
		registro.save(alumno);
		return "Alumno guardado.";
	}
	@GetMapping("/mostrarAlumno")
	public List<Alumno> mostrarAlumno(Model model){
		List<Alumno> alumnos = registro.findAll();
		model.addAttribute("alumnos",alumnos);
		return alumnos;
	}
}
