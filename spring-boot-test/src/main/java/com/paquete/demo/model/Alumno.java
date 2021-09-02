package com.paquete.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
	@Id
	@GeneratedValue
	public int matricula;
	public String nombre;
	public String apPaterno;
	public String apMaterno;
	public String materia;
}
