package com.educacionit;

import java.util.Scanner;

/**
 * * 1) Implementar un algoritmo que calcule y muestre por pantalla el valor
 * final de la compra de un artículo. El algoritmo debe permitir el ingreso del
 * precio del articulo y la cantidad de artículos. Si el subtotal es superior a
 * 1000, entonces se debe aplicar un descuento del 10 %.*/
public class Programa {

	public static void main(String[] args) {
		float precio = 0, descuento = 0, subtotal = 0, totalCompra = 0, cantidad = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculo de la compra de un articulo");
		
		System.out.println("Ingrese el Precio de un articulo ");
		precio = teclado.nextFloat();
		
		System.out.println("Ingrese la cantidad de articulos a comprar");
		cantidad = teclado.nextFloat();
		
		subtotal = precio * cantidad;
		
		if(subtotal >  1000) {
			descuento = subtotal * 0.10f;		
		}
		
		totalCompra = subtotal - descuento;
		
		if(descuento > 0) {
			System.out.println("Se aplico un descuento de " + descuento);
		}
		
		System.out.println("El Valor Final de la Compra es : " + totalCompra);
	}
}
