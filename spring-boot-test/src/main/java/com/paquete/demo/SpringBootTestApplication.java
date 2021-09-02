package com.paquete.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootTestApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		template.execute("DROP TABLE ALUMNO IF EXISTS");
		template.execute("DROP TABLE MATERIA IF EXISTS");
		template.execute("DROP TABLE CALIFICACION IF EXISTS");
		template.execute("CREATE TABLE ALUMNO(matricula INTEGER(11) PRIMARY KEY auto_increment, nombre VARCHAR(255), ap_paterno VARCHAR(255), ap_materno VARCHAR(255), materia VARCHAR(255))");
		template.execute("CREATE TABLE MATERIA(id_mat INTEGER(1) PRIMARY KEY auto_increment, nombre VARCHAR(255))");
		template.execute("CREATE TABLE CALIFICACION(id_cal INTEGER(11) PRIMARY KEY auto_increment, materia INTEGER(1), alumno INTEGER(11),calificacion INTEGER(2))");
		template.execute("INSERT INTO MATERIA(nombre) VALUES('MATEMATICAS')");
		template.execute("INSERT INTO MATERIA(nombre) VALUES('QUIMICA')");
		template.execute("INSERT INTO MATERIA(nombre) VALUES('ESPAÑOL')");
	}
}
