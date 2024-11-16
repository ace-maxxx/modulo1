package com.anahuac.mayab.modulo1.sesion3;

import java.util.ArrayList;
import java.util.Random;

public class TestPerro {

	public static void main(String[] args) {
								
		//Arreglo perros
		Perro[] misPerros = new Perro[10];
		
		String[] nombresPerros = {"Combo", "Waska", "Brownie", "Duvalin", "Huesito", "Satan", "Max", "Manchas", "Chaneque", "Muppet"};
		String[] nombresDuenos = {"Itzel", "Alex", "Alberto", "Flor", "Silvaine", "Roro", "Kikis", "Fer", "Clau", "Pili"};
		
		for(int i = 0; i < 10; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombresPerros[i]);			
		}
		
		Random generador = new Random();
		
		for(int i=0; i < 10; i++) {
			int aleatorio = generador.nextInt(10);
			misPerros[i].setNombreDueno(nombresDuenos[aleatorio]);
		}

		for(int i = 0; i < 10; i++) {			
			misPerros[i].ladrar();			
		}
		
		// Array List de Perros
		System.out.println("-------- ArrayList de Perros --------");
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		
		for(int i = 0; i < 10; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombresPerros[i]);
			int aleatorio = generador.nextInt(10);
			perroTemporal.setNombreDueno(nombresDuenos[aleatorio]);
			
			listaPerros.add(perroTemporal);
		}
		for(int i = 0; i < 10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		//Busqueda de un perro
		for(int i=0; i < listaPerros.size(); i++) {
			String nombre = listaPerros.get(i).getNombre();
			if(nombre == "Duvalin") {
				listaPerros.get(i).setNombre("Shub Niggurath");
				break;
			}
		}
		System.out.println("-----Despues de cambiar el nombre------");
		
		for(int i = 0; i < 10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		System.out.println("------Usando un HashMap ------");
		
		for(int i = 0; i < 10; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombresPerros[i]);
			int numeroAleatorio = generador.nextInt(nombresPerros.length);
			perroTemporal.setNombreDueno(nombresDuenos[numeroAleatorio]);
			
		}
	}

}
