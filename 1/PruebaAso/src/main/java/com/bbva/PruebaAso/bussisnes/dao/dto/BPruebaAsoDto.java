package com.bbva.PruebaAso.bussisnes.dao.dto;

public class BPruebaAsoDto {
	
	
	private String id;
	private String nombre;
	private String Apellido;
	private String edad;
	
	public BPruebaAsoDto() {
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
		return "PruebaAsoDto [id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + "]";
	}
	
	

}
