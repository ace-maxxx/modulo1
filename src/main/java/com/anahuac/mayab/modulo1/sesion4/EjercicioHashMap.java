package com.anahuac.mayab.modulo1.sesion4;

import java.util.HashMap;
import java.util.Map;

public class EjercicioHashMap {

	public static void main(String[] args) {
		// Creating HashMap Object
		HashMap<String,Integer> students = new HashMap<>();
		
		// Adding key-value pairs (student name and age) to the HashMap
		students.put("Alice", 20);
		students.put("Bob", 22);
		students.put("Charlie", 19);
		students.put("Donald", 55);
		
		// Retrieving a value by its key
		Integer aliceAge = students.get("Alice");
		System.out.println("Alice's age: " + aliceAge);
		
		// Checking if a key is present in the HashMap
		boolean containsKey = students.containsKey("David");
		System.out.println("Is David in the HashMap? " + containsKey);
		
		// HashMap Size
		System.out.println("Size of original HashMap: " + students.size());
		
		// Removing a key-value pair by its key
		students.remove("Bob");
		System.out.println("Size of modified HashMap: " + students.size());
		
		// Iterating over the HashMap using a for-each loop and entrySet
		System.out.println("------ Iterating over the HashMap ------");
		
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			String name = entry.getKey();
			Integer age = entry.getValue();
			System.out.println(name + ": " + age);
		}
		// Iterating over the HashMap using a for-each loop only for keys
		System.out.println("------ Iterating using only keys ------");
		for (String llave : students.keySet()) {			
			System.out.println(llave);
			System.out.println("Edad: " + students.get(llave));
		}

	}

}
