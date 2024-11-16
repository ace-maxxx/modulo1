package com.anahuac.mayab.modulo1.sesion3;

public class Perro {
	private String raza, tamano, nombre, nombreDueno;
	private int edad;
	private double peso;
	
	public Perro() {}
	
	public Perro(String raza, String tamano, String nombre, String nombreDueno, int edad, double peso) {
		super();
		this.raza = raza;
		this.tamano = tamano;
		this.nombre = nombre;
		this.nombreDueno = nombreDueno;
		this.edad = edad;
		this.peso = peso;
	}
	public Perro(String raza, String nombre, int edad, String nombreDueno) {
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.nombreDueno = nombreDueno;
	}

	// Getters y setters
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreDueno() {
		return nombreDueno;
	}
	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Metodos
	public void ladrar() {
		System.out.println("Me llamo " + this.nombre + ", mi dueño se llama " + this.nombreDueno + ", guau guau");
	}

	@Override
	public String toString() {
		return "Raza=" + raza + ", tamano=" + tamano + ", nombre=" + nombre + ", nombreDueno=" + nombreDueno
				+ ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	

}
