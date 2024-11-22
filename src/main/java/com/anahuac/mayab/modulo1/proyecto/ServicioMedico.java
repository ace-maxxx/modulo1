package com.anahuac.mayab.modulo1.proyecto;

public class ServicioMedico extends Servicio {

	public ServicioMedico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);		
	}

	public void consultar(String nombre) { // Recibe el nombre del paciente
		System.out.println("Realizando consulta del paciente... " + nombre);
	}
	
	public void darReceta() {
		System.out.println("Crear receta con recomendaciones... ");
	}
	@Override
	public void realizar(String nombre) { // Implementacion de realizar()
		getCartilla().actualizar(getTipo(), getFecha());
		consultar (nombre);
		darReceta();
				
	}

}
