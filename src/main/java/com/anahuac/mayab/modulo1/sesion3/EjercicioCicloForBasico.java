package com.anahuac.mayab.modulo1.sesion3;

public class EjercicioCicloForBasico {

	public static void main(String[] args) {
		
		int[] numbers = {60, 10, 20, 30, 40, 50};
		
		System.out.println("Element at index 0: " + numbers[0]);
		System.out.println("Element at index 2: " + numbers[2]);
		System.out.println("Element at index 4: " + numbers[4]);
		
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("The sum of numbers is: " + sum);
		
		
	}

}
