package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// 1)	Calcular el promedio de un alumno que tiene 7 calificaciones 
		//      en la materia de Diseño Estructurado de Algoritmos.
		
		float notaIngresada = 0 , acumuladorNotas = 0 , promedio = 0 ;
		Scanner teclado = new Scanner(System.in );
		int contador = 1 , cantidadDeNotas = 7;
		
		while(contador <= cantidadDeNotas) {
			System.out.println("Ingrese la nota " + contador);
			notaIngresada = teclado.nextFloat();
			
			acumuladorNotas += notaIngresada; 
			
			contador++;
		}
		
		promedio = acumuladorNotas / cantidadDeNotas;
		
		System.out.println("La suma de todas las notas es : " + acumuladorNotas);
		System.out.println("El promedio es : " + promedio);
		
	}

}
 