package com.educacionit;

import java.util.Scanner;

/**
 * TAREA! 2) Una tienda ofrece un descuento del 15% sobre el total de la compra
 * y un cliente desea saber cuanto debera pagar finalmente por su compra
 */
public class Programa {

	public static void main(String[] args) {
		// defino mis variables de trabajo
		float totalCompra = 0, descuento = 0, totaApagar = 0;

		Scanner teclado = new Scanner(System.in);

		// que entra?
		System.out.println("Ingrese por favor el total de su compra");
		totalCompra = teclado.nextFloat();

		// que se procesa ?
		descuento = totalCompra * 0.15f;
		totaApagar = totalCompra - descuento;

		// que sale ?
		System.out.println("su total a pagar es : " + totaApagar + " pesos ");

	}
}
