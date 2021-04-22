package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine(); // Crea un objeto de tipo string
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Número de caracteres.....: " + nombre.length());
	}
}
