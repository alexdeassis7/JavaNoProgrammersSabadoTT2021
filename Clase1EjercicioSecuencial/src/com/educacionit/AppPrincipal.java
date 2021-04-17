package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	/**Ejercicio Secuencial 1 ) 
	 * suponga que un individuo desea invertir su capital en un banco y desea saber cuanto dinero ganara 
	 * despues de un mes si el banco paga a razon de 2% mensual */
	public static void main(String[] args) {
		//que variables de trabajo necesito ?
		float capital = 0 , ganancia = 0 ;
		final float porcetaje = 0.02f;
		
		Scanner teclado = new Scanner(System.in);
		//		que entra ? 
		System.out.println("Que capital desea invertir este mes en banco??");				
		capital = teclado.nextFloat();
		
//		que se procesa ?
		ganancia = capital * porcetaje ;	
				
//	    que Sale ?
		System.out.println("la ganancia que obtendra luego de un mes por invertir $" + capital + " es $ " + ganancia );
		
		teclado.close();
		
	}
	
}
