package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
		// demostracion estructura repetitiva for : Utilizarla cuando conocemos a priori
		// en numero exacto de iteraciones a realizar

		System.out.println("Inicio de la app ");

		// mostrar los numeros del 0 al 100
		for (int contador = 0; contador <= 100; contador++) {
			// sentencia a ejecutar
			System.out.println(contador);

		}
		System.out.println("mostramos los numeros del cien al cero ");
		for (int x = 100; x >= 0; x--) {
			System.out.println(x);
		}

		System.out.println("Fin de la app ");

	}
}
