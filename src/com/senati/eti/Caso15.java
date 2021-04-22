package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese cantidad........:");
		int cantidad = sc.nextInt();
		System.out.print("Ingrese cantidad........:");
		float precio = sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = importe1 / 3.24f;
		// puedes ponerlo como importe1 / 3.24f o
		//                     (float) (importe1 / 3.24)
		//                     para arreglar el error
		float importe3 = importe1 / 3.75f;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Importe S/........: " + df.format(importe1));
		System.out.println("Importe U$........: " + df.format(importe2));
		System.out.println("Importe €.........: " + df.format(importe3));
	}
}
