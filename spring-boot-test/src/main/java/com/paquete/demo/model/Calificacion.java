package com.paquete.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {
	@Id
	@GeneratedValue
	public int id;
	public int materia;
	public int alumno;
	public int calificacion;
}
