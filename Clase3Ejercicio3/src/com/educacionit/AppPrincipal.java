package com.educacionit;

import java.util.Scanner;

//3)	Leer 10 números e imprimir solamente los positivos
public class AppPrincipal {

	public static void main(String[] args) {

		int numeroIngresado = 0, contador = 100;
		Scanner teclado = new Scanner(System.in);

		while (contador <= 10) {
			System.out.println("Ingrese por favor el numero " + contador);
			numeroIngresado = teclado.nextInt();
			if (numeroIngresado > 0) {
				System.out.println("Positivo : " + numeroIngresado);
			}
			contador++;
		}
		
		contador = 100; //reseteamos el contador 
		System.out.println("ahora vamos con el Do-While");
		do {
			System.out.println("Ingrese por favor el numero " + contador);
			numeroIngresado = teclado.nextInt();
			if (numeroIngresado > 0) {
				System.out.println("Positivo : " + numeroIngresado);
			}
			contador++;
		}while(contador <= 10);

		/*
		 * while(condicion) { //sentencias a ejecutar mientras la condicion se cumpla }
		 * //se ejecute una sola vez //nunca se ejecuten //se ejecute n veces
		 * 
		 * 
		 * do { //sentencias a ejecutar mientras la condicion se cumpla
		 * }while(condicion); //se ejecuta si o si por lo menos una vez //se ejecute n
		 * veces
		 */
		System.out.println("Fin de la app ");
	}

}
