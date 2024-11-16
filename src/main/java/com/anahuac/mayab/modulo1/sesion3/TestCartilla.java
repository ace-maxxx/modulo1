package com.anahuac.mayab.modulo1.sesion3;

import java.io.IOException;

public class TestCartilla {

	public static void main(String[] args) {
		Perro miPerro = new Perro("Unica", "Firulais", 5, "Alex");
		
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(miPerro);
		
		cartilla.actualizar("Rabia", "05/MAR/2022");
		cartilla.actualizar("Rabia", "05/MAR/2023");
		cartilla.actualizar("Rabia", "05/MAR/2024");
		cartilla.actualizar("Parvovirus", "05/MAR/2022");
		cartilla.actualizar("SARS", "05/MAR/2023");
		//cartilla.imprimirCartilla();
		
		try {
			cartilla.imprimirExpediente();
		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
			e.printStackTrace();
		}
		
	}

}
