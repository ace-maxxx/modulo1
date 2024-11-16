package com.anahuac.mayab.modulo1.sesion5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestArchivo {

	public static void main(String[] args) {
		String nombreArchivo= "/home/perroto/Documents/UNIMAYAB Diplomado Java y Python/prueba.txt";
		try (FileWriter archivo = new FileWriter(nombreArchivo)) {
			PrintWriter pw = new PrintWriter(archivo);
			pw.print("Hola, bienvenido al diplomado de programacion");
			pw.print("\nJAVA Y PYTHON");
		} catch (Exception e) {
			System.out.println("No pudo abrirse el archivo");
			e.printStackTrace();
		}
		
		
	}

}
