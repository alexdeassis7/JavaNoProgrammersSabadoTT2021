package com.educacionit;

import java.util.Scanner;

//4)	Leer 20 números e imprimir cuantos son positivos , cuantos negativos y cuantos neutros
public class AppPrincipal {

	public static void main(String[] args) {
		int contador = 1, numeroIngresado = 0, cantidadNeutros = 0, cantidadPositivos = 0, cantidadNegativos = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("ingrese el numero " + contador);
			numeroIngresado = teclado.nextInt();

			if (numeroIngresado < 0) {
				cantidadNegativos++;
			} else if (numeroIngresado > 0) {
				cantidadPositivos++;
			} else {
				cantidadNeutros++;
			}

			contador++;
		} while (contador <= 20);

		System.out.println("De los 20 numeros ingresados ");
		System.out.println( cantidadNegativos + " eran negativos");
		System.out.println( cantidadPositivos + " eran positivos");
		System.out.println( cantidadNeutros + " eran neutros");
	}

}
