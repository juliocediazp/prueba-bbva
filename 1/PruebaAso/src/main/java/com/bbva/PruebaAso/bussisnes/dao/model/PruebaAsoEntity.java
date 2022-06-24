package com.bbva.PruebaAso.bussisnes.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PRUEBA")
public class PruebaAsoEntity {
	
	@Id
	@Column(name ="id")
	private String id;
	@Column(name ="nombre")
	private String nombre;
	@Column(name ="Apellido")
	private String Apellido;
	@Column(name ="edad")
	private String edad;
	
	public PruebaAsoEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "PruebaAsoEntity [id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + "]";
	}
	
	

}
