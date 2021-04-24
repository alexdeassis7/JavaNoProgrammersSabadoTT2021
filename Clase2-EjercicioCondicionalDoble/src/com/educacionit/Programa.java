package com.educacionit;

import java.util.Scanner;

/**
 * 1) Desarrollar un algoritmo que permita determinar si un número ingresado por
 * teclado es positivo o negativo.
 */

public class Programa {
	public static void main(String[] args) {
		int numeroIngresado = 0 ;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese  un numero entero distinto de cero ");
		numeroIngresado = teclado.nextInt();
		//Condicionales anidados!
		if(numeroIngresado > 0 ) {
			System.out.println("el numero ingresado es positivo ");
			
		}else if( numeroIngresado < 0){
			
			System.out.println("el numero ingresado es Negativo "); 	
			
		}else  {
			System.out.println("el numero ingresado es Neutro");
		}
		
	}
}
