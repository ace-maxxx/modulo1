package com.anahuac.mayab.modulo1.sesion3;
import java.util.ArrayList;
import java.util.HashMap;


public class TestPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Labrador", "Grande", 15, "Max", "Monse", 5);
		Perro perro2 = new Perro("Dalmata", "Mediano", 12, "Manchas", "Mau", 8);
		Perro perro3 = new Perro("Bulldog", "Pequeño", 8, "Bongo", "Adriana", 1);
		Perro perro4 = new Perro("Chihuahua", "Pequeño", 2, "Chiquis", "Fernando", 10);
		Perro perro5 = new Perro("Salchicha", "Pequeño", 6, "Chito", "Vic", 3);
		
		// Arreglo simple
		System.out.println("---------- Arreglo simple ----------");
		Perro[] misPerros = {perro1, perro2, perro3, perro4, perro5};
				
		for(int i = 0; i < misPerros.length; i++) {
			misPerros[i].ladrar();
		}
		
		// Array List
		System.out.println("---------- ArrayList ----------");
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		
		listaPerros.add(perro1);
		listaPerros.add(perro2);
		listaPerros.add(perro3);
		listaPerros.add(perro4);
		listaPerros.add(perro5);
		
		for(Perro p : listaPerros) {
			p.ladrar();
		}
		
		// HashMap
		System.out.println("---------- HashMap ----------");
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		
		mapPerros.put(perro1.getEdad(), perro1); // Para el Integer se usó la edad en vez de enteros del 1 al 5
		mapPerros.put(perro2.getEdad(), perro2);
		mapPerros.put(perro3.getEdad(), perro3);
		mapPerros.put(perro4.getEdad(), perro4);
		mapPerros.put(perro5.getEdad(), perro5);
		
		for(Integer clave : mapPerros.keySet()) {
			Perro p = mapPerros.get(clave);
			p.ladrar();
			
		}
		
		
	}

}