package com.educacionit;

import java.util.Scanner;
/**
 * 2) Desarrollar un algoritmo que permita determinar si un número ingresado por
 * teclado es par o impar
 */

public class Programa {
public static void main(String[] args) {
		
		// Demostracion con dos numeros
		int numero1 = 0, numero2 = 0;
		int resto;
		
		Scanner teclado = new Scanner(System.in); // Ctrl + Shift + O
		
		System.out.println("Ingresa el primer numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingresa el segundo numero:");
		numero2 = teclado.nextInt();
		
		resto = numero1 % 2;
		
		if (resto == 0) {
			System.out.println("El numero1 ingresado es par.");
		} else {
			System.out.println("El numero1 ingresado es impar.");
		}
		
		resto = numero2 % 2;
		
		if (resto == 0) {
			System.out.println("El numero2 ingresado es par.");
		} else {
			System.out.println("El numero2 ingresado es impar.");
		}
		

	}

}
