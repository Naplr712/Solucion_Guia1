package com.senati.eti;

// Importando la librería para lectura de datos
// Scanner = librería para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		//Creado un objeto sc a partir de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarar la variable y asignar un valor
		int numero = 0;
		
		// Lectura
		System.out.print("Ingrese número: ");
		numero = sc.nextInt();
		
		// Impresión
		System.out.println("\nNúmero Ingresado");
		System.out.println("------------------");
		System.out.println("Número.....: " + numero);
		
	}

}
