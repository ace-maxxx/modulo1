package com.anahuac.mayab.modulo1;

public class circulo {
	
	public static double calcularArea(double radio) {
		double area = Math.pow(radio, 2) * Math.PI;
		return area;
	}

	public static void main(String[] args) {
		
		System.out.println("La superficie es: " + calcularArea(5));		
		System.out.println("La superficie es: " + calcularArea(10));		
		

	}

}
