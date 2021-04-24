package com.educacionit;

public class Programa {

	public static void main(String[] args) {

		System.out.println("inicio App");
		// Sintaxis estructura condicional SIMPLE (IF)
		
		int a = 0 , b = 5;
		boolean esVerdad = false;
		esVerdad = (a < b);
		
		if (esVerdad) { // condicion : expresion logica
			// sentencia a ejecutar si la condicion es verdadera
			System.out.println("hola");
			System.out.println("hola1");
			System.out.println("hola2");
			System.out.println("hola3");
		}

		System.out.println("Fin App");

	}
}
