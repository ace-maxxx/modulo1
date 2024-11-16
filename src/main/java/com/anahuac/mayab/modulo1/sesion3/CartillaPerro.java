package com.anahuac.mayab.modulo1.sesion3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
    // Atributos
    private Perro datosPerro;
    private String idCartilla;
    HashMap<String, ArrayList<String>> vacunas = new HashMap<>();

    // Constructores
    public CartillaPerro() {}

    public CartillaPerro(Perro datosPerro, String idCartilla) {
        super();
        this.datosPerro = datosPerro;
        this.idCartilla = idCartilla;
    }

    // Getters y setters
    public Perro getDatosPerro() {
        return datosPerro;
    }

    public void setDatosPerro(Perro datosPerro) {
        this.datosPerro = datosPerro;
    }

    public String getIdCartilla() {
        return idCartilla;
    }

    public void setIdCartilla(String idCartilla) {
        this.idCartilla = idCartilla;
    }

    public HashMap<String, ArrayList<String>> getVacunas() {
        return vacunas;
    }

    public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
        this.vacunas = vacunas;
    }
    
    public void actualizar(String nombreVacuna, String fechaAplicacion) {
		//Checar si la vacuna existe en la cartilla
		if (vacunas.containsKey(nombreVacuna)) {
			ArrayList<String> fechas = vacunas.get(nombreVacuna);
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		else { //NO existe
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		
	}
    
    public void imprimirCartilla() {
    	System.out.println("----- Datos perro -----");
    	System.out.println(datosPerro.toString());
    	for(String vacuna : vacunas.keySet()) {
    		System.out.println("Vacuna: " + vacuna);
    		ArrayList<String> fechas = vacunas.get(vacuna);
    		for(String fecha : fechas ) {
    			System.out.println("Fecha: " + fecha);
    		}
    		System.out.println("------------");
    	}
    }
    
    public void imprimirExpediente() throws IOException {
    	String nombreArchivo = datosPerro.getNombre() + ".txt";
		//try 
    	FileWriter archivo = new FileWriter(nombreArchivo);
			PrintWriter pw = new PrintWriter(archivo);
			pw.println("----- Datos perro -----");
			pw.println(datosPerro.toString());
			for(String vacuna : vacunas.keySet()) {
				pw.println("Vacuna: " + vacuna);
				ArrayList<String> fechas = vacunas.get(vacuna);
				for(String fecha : fechas ) {
					pw.println("Fecha: " + fecha);
				}
				pw.println("------------\n");
			}
			pw.close();
			
		//} catch (Exception e) {
			//System.out.println("Hubo un problema al intentar crear el archivo: " + nombreArchivo);
			//e.printStackTrace();
		//}
    }
    
    
}

