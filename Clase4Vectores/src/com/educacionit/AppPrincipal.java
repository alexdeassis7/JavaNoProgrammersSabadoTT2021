package com.educacionit;

import java.util.Iterator;

public class AppPrincipal {
	/*
	 * 2) Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno
	 * del vector A con el elemento uno del vector B y así sucesivamente hasta 45,
	 * almacenar el resultado en un vector C, e imprimir el vector resultante por
	 * pantalla.
	 */
	public static void main(String[] args) {
		final int CANTIDAD_DE_ELEMENTOS = 45;

		// defino los 3 vectores a , b y c
		int vectorA[] = new int[CANTIDAD_DE_ELEMENTOS];
		int vectorB[] = new int[CANTIDAD_DE_ELEMENTOS];
		int vectorC[] = new int[CANTIDAD_DE_ELEMENTOS];

		System.out.println("Cantidad de elementos:" + vectorA.length);

		for (int i = 0; i < vectorA.length; i++) {
			// cargamos los vectores con numeros random
			vectorA[i] = (int) (Math.random() * 100);
			vectorB[i] = (int) (Math.random() * 100);
			vectorC[i] = vectorA[i] + vectorB[i];
			
//			mostramos los vectores
			System.out.println(vectorA[i] + " + " + vectorB[i] + " = " + vectorC[i]);

		}

		// demo de numeros aleatorios
		System.out.println("numeros generados entre 0 y 100 ,sin decimales ");

		for (int i = 0; i < 10; i++) {
			int numeroAleatorioGenerado = (int) (Math.random() * 100);
			System.out.println(numeroAleatorioGenerado);
		}

	}

}
