package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Primer número...: ");
		num1 = sc.nextFloat();
		
		System.out.print("Segundo número...: ");
		num2 = sc.nextFloat();
		
		System.out.println("\nNúmero Ingresados");
		System.out.println("-------------------");
		System.out.println("Número 1...: " + num1);
		System.out.println("Número 2...: " + num2);
	}

}
