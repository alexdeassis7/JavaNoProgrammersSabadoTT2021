package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// 7) Calcular e imprimir la tabla de multiplicar de un número cualquiera.
		// Imprimir el multiplicando , el multiplicador y el producto

		int numeroIngresado = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("que tabla desea conocer ? ");
		numeroIngresado = teclado.nextInt();
	
		System.out.println("la tabla de multiplicar del " + numeroIngresado + " es : ");
		for (int i = 1; i <= 10; i++) {
			resultado = numeroIngresado * i;

			System.out.println(numeroIngresado + " X " + i + " = " + resultado);
		}

		System.out.println("Fin de la app");
	}

}
