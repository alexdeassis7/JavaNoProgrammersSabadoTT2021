package com.educacionit;

import java.util.Scanner;

/*2) Desarrollar un algoritmo que permita ingresar un número entero 
comprendido entre 1 y 10, y que muestre por pantalla si el número es par o 
impar*/
public class AppPrincipal {

	public static void main(String[] args) {

		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese por favor un numero entero comprendido entre 1 y 10");
		numeroIngresado = teclado.nextInt();
		if (numeroIngresado >= 1 && numeroIngresado <= 10) {
			switch (numeroIngresado) {

			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("el numero ingresado en Impar");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("el numero ingresado en Par");
				break;
			}
		} else {
			System.out.println("el numero ingresado esta fuera del rango 1 - 10 ");
		}
	}
}
