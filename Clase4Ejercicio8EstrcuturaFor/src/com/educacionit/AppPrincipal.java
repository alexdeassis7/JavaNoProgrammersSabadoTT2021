package com.educacionit;

//8)	Simular el comportamiento de un reloj digital, imprimiendo la hora, 
//minutos y segundos de un día desde las 0:0:0 hasta las 23:59:59
public class AppPrincipal {

	public static void main(String[] args) {
		// for anidados
		for (int hs = 0; hs <= 23; hs++) {

			for (int min = 0; min <= 59; min++) {

				for (int seg = 0; seg <= 59; seg++) {

					System.out.println(hs + ":" + min + ":" + seg);
				}
			}
		}
//atajo para identar el codigo :ctrl+shift +f
	}

}
