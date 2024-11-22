package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico extends Servicio {

	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
		
	}
	
	public void banar() {
		System.out.println("Bañando... ");
	}
	public void cepillar() {
		System.out.println("Cepillando... ");
	}
	public void cortarUnas() {
		System.out.println("Cortando uñas... ");
	}
	
	@Override
	public void realizar(String nombre) {
		System.out.println("Atendiendo a: " + nombre);
		banar();
		cepillar();
		cortarUnas();
		
	}

}
