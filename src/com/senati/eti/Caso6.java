package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// CAST -> Convertir de un tipo de dato a otro
		int rpta1 = (int) Math.pow(5, 3);
		// Raiz cuadrada -> base elevada a la inversa del exp.
		float rpta2 = (float) Math.pow(81,  1/2.0);
		
		System.out.println("\nResultados");
		System.out.println("-------------");
		System.out.println("Respuesta 1...: " + rpta1);
		System.out.println("Respuesta 2...: " + rpta2);
	}
}
