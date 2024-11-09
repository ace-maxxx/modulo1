package com.anahuac.mayab.modulo1.sesion3;

public class TestPerro {

	public static void main(String[] args) {
		
		Perro perrito1 = new Perro();
		Perro perrito2 = new Perro("Yorkie", "Pequeño", "Combo", "Ivy", 2, 4.5);
		
		System.out.println("El perrito 1 se llama " + perrito1.getNombre());
		System.out.println("El perrito 2 se llama " + perrito2.getNombre());
		
		// Ya sabemos el nombre del perro1
		perrito1.setNombre("Braulio");
		
		System.out.println("El perrito 1 se llama: " + perrito1.getNombre());
		perrito1.ladrar();
		

	}

}
