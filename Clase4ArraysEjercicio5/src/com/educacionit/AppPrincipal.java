
//5)	Almacenar 300 números en un vector, imprimir cuantos son ceros, cuantos son negativos y cuantos positivos. 
//Imprimir además la suma de los negativos y la suma de los positivos 

package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
		// Almacenar 300 números en un vector, imprimir cuantos son ceros,
		// cuantos son negativos y cuantos positivos. Imprimir además la suma de los
		// negativos y la suma de los positivos

		int vecOriginal[] = new int[10];
//		int vecHarcodeado[] = { 0, 0, 5, -8, -9, 10 };
//		
//		System.out.println("catidad de elementos: " +vecHarcodeado.length);

		int contadorNegativos = 0, contadorPositivos = 0, neutros = 0, sumaNeg = 0, sumaPos = 0;

		for (int i = 0; i < vecOriginal.length; i++) {

			if ((i % 2) == 0) {

				vecOriginal[i] = i * -1;

			} else {
				vecOriginal[i] = i;
			}

			if (vecOriginal[i] == 0) {

				neutros++;

			} else if (vecOriginal[i] > 0) {

				sumaPos += vecOriginal[i];

				contadorPositivos++;

			} else if (vecOriginal[i] < 0) {

				sumaNeg += vecOriginal[i];

				contadorNegativos++;

			}
		}

		System.out.println(contadorNegativos);

		System.out.println(contadorPositivos);

		System.out.println(neutros);

		System.out.println(sumaNeg);

		System.out.println(sumaPos);

	}

}
