package com.anahuac.mayab.modulo1.sesion4;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			//Agregar elementos a la lista
			num.add(i);
		}
		
		System.out.println("Elemento 0 en la lista: " + num.get(0));
		num.add(100);
		
		System.out.println("Ultimo elemento en la lista: " + num.get(num.size()-1));
		
		// Agrega multiples elementos al final de la lista en una sola linea
		num.addAll(Arrays.asList(13,14,15,16,17,18));
		System.out.println("---------Agregando otra lista---------");
		for(int i=0; i<num.size(); i++) {
			System.out.println("P= " + (i) + "\tV= " + num.get(i));
		}
	}

}
