package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
		// Demo If - else Inline

		// necesitamos conocer si un numero es mayor a 8
		int numero = 5;

		if (numero > 8) {
			System.out.println("numero es mayor a 8 ");
		} else {
			System.out.println("numero es menor a 8 ");
		}

		// (condicion) ? "si la condicion es true" : "si la condicion es false"
		String resultado = (numero > 8) ? "numero es mayor a 8" : "numero es menor a 8";

		System.out.println("Resultado del operador Ternario :");
		System.out.println(resultado);

	}

}
