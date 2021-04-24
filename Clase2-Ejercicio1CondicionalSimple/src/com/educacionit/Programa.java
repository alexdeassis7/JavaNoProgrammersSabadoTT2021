package com.educacionit;

import java.util.Scanner;

/**
 * 1) Determinar si un alumno aprueba un curso de programación, sabiendo que
 * aprobara si su promedio de tres calificaciones es mayor o igual a 7; reprueba
 * en caso contrario
 */
public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;

		System.out.println("Ingrese la nota 1");
		nota1 = teclado.nextFloat();

		System.out.println("Ingrese la nota 2");
		nota2 = teclado.nextFloat();

		System.out.println("Ingrese la nota 3");
		nota3 = teclado.nextFloat();

		promedio = (nota1 + nota2 + nota3) / 3;
			//Con Condicional Simple (if)
		/*if (promedio >= 7) {
			System.out.println("Aprobado! , congratulations!");
		}
		if (promedio < 7) {
			System.out.println("Desaprobado! , Game Over !");
		}*/
		
		// CONDICIONAL DOBLE (if - else)
		if (promedio >= 7) {
			System.out.println("Aprobado! , congratulations!");
		} else {
			System.out.println("Desaprobado! , Game Over !");
		}

		System.out.println("promedio : " + promedio);

	}
}
