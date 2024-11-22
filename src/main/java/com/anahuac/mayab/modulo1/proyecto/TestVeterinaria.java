package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {

	public static void main(String[] args) {
		// Perro(String raza, String tamanio, double peso, String nombre, String nombreDuenio, int edad)
		Perro perro1 = new Perro("Yorkie", "Pequeño", 3.2, "Brownie","Itzel M.", 3); // Perro 1
		Perro perro2 = new Perro("Blue Heeler", "Mediano", 9.3, "Nené","Fernando G.", 5); // Perro 2
		
		CartillaPerro cartilla1 = new CartillaPerro(perro1, "00100"); // Cartilla del Perro 1
		CartillaPerro cartilla2 = new CartillaPerro(perro2, "00101"); // Cartilla del Perro 2
		
		Veterinaria vet = new Veterinaria("Clínica Veterinaria Paw Patrol"); 
		vet.agregarPaciente(cartilla1);
		vet.agregarPaciente(cartilla2);
		
		try {
			// Servicios del perro1
			Servicio servicio = vet.crearServicio("baño", perro1.getNombre(), "2024/09/11");
			servicio.realizar(perro1.getNombre());
			Servicio servicio2 = vet.crearServicio("Vacuna Rabia", perro1.getNombre(), "2024/04/15");
			servicio2.setCartilla(cartilla1);
			servicio2.realizar(perro1.getNombre());
			cartilla1.imprimirCartilla();
			
			// Servicios del perro2
			Servicio servicio3 = vet.crearServicio("corte", perro2.getNombre(), "2024/08/30");
			servicio3.realizar(perro2.getNombre());
			Servicio servicio4 = vet.crearServicio("Vacuna Parvovirus", perro2.getNombre(), "2024/11/21");
			servicio4.setCartilla(cartilla2);
			servicio4.realizar(perro2.getNombre());
			cartilla2.imprimirCartilla();
			
			
		} catch (Exception e) {
			System.out.println("Ese servicio no lo realizamos.");
			e.printStackTrace();
		}
		// Imprimir expedientes
		vet.imprimirExpedientes();

	}

}
