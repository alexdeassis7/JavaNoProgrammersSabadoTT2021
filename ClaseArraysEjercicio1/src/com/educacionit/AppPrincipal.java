package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
//		1)	Calcular el promedio de 50 valores almacenados en un Vector. 
//         Determinar además cuantos son mayores que el promedio, imprimir el promedio, 
//         el número de datos mayores que el promedio y una lista de valores mayores que el promedio .

		float[] vectorOriginal = new float[10];
		float[] vectorMayoresAlPromedio;
		float acumuladorDeValores = 0, promedio = 0;
		int cantDatosMayoresAlPromedio = 0;

		// recorremos y cargamos el vector de manera aleatoria
		for (int i = 0; i < vectorOriginal.length; i++) {
			vectorOriginal[i] = (int) (Math.random() * 100 + 1); // casting explicito
			acumuladorDeValores += vectorOriginal[i]; // sumamos todos los elementos del array
		}
		// calculamos el promedio
		promedio = acumuladorDeValores / vectorOriginal.length;
		// recorremos el arrays y determinamos cuantos valores son mayores que
		// el promedio
		for (int i = 0; i < vectorOriginal.length; i++) {
			if (vectorOriginal[i] > promedio) {
				cantDatosMayoresAlPromedio++;
			}
		}
		// inicializamos el vector que contendra a la lista de datos mayores al promedio
		vectorMayoresAlPromedio = new float[cantDatosMayoresAlPromedio];
		// cargamos la lista de valores mayores que el promedio
		int j = 0;
		for (int i = 0; i < vectorOriginal.length; i++) {
			if (vectorOriginal[i] > promedio) {
				vectorMayoresAlPromedio[j] = vectorOriginal[i];
				j++;
			}
		}

		// mostramos el vectorOriginal cargado
		for (int i = 0; i < vectorOriginal.length; i++) {
			System.out.println("vectoOriginal[" + i + "]=" + vectorOriginal[i]);
		}
		System.out.println("existen " + cantDatosMayoresAlPromedio + " Datos Mayores Al Promedio");
		System.out.println("acumulador de valores: " + acumuladorDeValores);
		System.out.println("El promedio es :" + promedio);

		System.out.println("Mostramos la lista de datos mayores al promedio :");
		for (int i = 0; i < vectorMayoresAlPromedio.length; i++) {
			System.out.println("vectorMayoresAlPromedio[" + i + "]=" + vectorMayoresAlPromedio[i]);
		}

	}

}
