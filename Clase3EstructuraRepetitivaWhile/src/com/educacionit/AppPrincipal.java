package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {

		System.out.println("Inicio de la app ");
		// estructura repetitiva Mientras

		// 1) mostrar lo numeros del 0 al 100

		int contador = 0;

		while (contador <= 100) {
			// instrucciones a ejecutar mientras la condicion se cumpla
			System.out.println(contador);

			// modificar el valor de contador para que la condicion en algun momento pase a
			// ser false
			// contador = contador + 1;
			// contador += 1;
			contador++; // operador auto incremental
		}

		System.out.println("Mostramos los numeros pares del 0 al 1000 ");
		// 2) mostrar los numeros pares del 0 al 1000
		contador = 0;
		while (contador <= 1000) {
			
			System.out.println(contador);		
			contador += 2;
		}

		System.out.println("numeros del 100 al 0");
		// 3) mostrar los numeros del 100 al 0
		contador = 100;
		while (contador >= 0) {
			System.out.println(contador);
//			contador =  contador - 1;
//			contador -= 1;
			contador--; // operador decremental
		}
		System.out.println("Fin de la app ");
	}

}
