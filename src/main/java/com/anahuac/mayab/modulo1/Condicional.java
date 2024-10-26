package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 10;
				
		if (num1 > num2) {
			System.out.println("El número " + num1 + " es el mayor ");			
		} else if (num1 < num2) {
			System.out.println("El número " + num2 + " es el mayor ");
		} else {
			System.out.println("Los números son iguales");
		}

	}

}
