package com.anahuac.mayab.modulo1;

public class Propina {

	public static void main(String[] args) {
		int propinaMin;
		double cuenta, propina;
		cuenta = 75;
		propinaMin = 10;
		propina = (cuenta * .10);
		
		if (cuenta >= 100) {
			System.out.printf("\nEl total de la cuenta es: " + cuenta);
			System.out.printf("\nLa propina es: " + propina);
		} else {
			System.out.printf("\nEl total de la cuenta es:" + cuenta);
			System.out.printf("\nLa propina es:" + propinaMin);
		}

	}

}
