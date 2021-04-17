package com.educacionit;

import  java.util.Scanner;

//comentario de linea 

/*soy 
 * un 
 * comentario 
 * de 
 * bloque */
public class MiApp {

	//funcion principal - punto de inicio de la ejecucion de mi app!
	public static void main(String[] args) {
		//mostrar una salida por consola - output 
		System.out.println("Hola Mundo - Educacion IT! ");
		
		//Variables : espacio en memoria 
		//definimos variables 
		//tipoDeDato Identificador = valorInicial ;
		
		//tipos de datos primitivos en JAVA
		//int , float , double, char , long ....
		//numeros enteros 
		int edadEmpleado = 18;
		short soyUnEnteroCorto = 123;
		long soyUnEnteroLArgo = 123123123;
		byte cortisimo = 12;
		
		//numeros con decimales 
		float precioProducto = 125.5f;
		precioProducto = 124.8f;
		
		double precioConMayorPrecision = 0;
		
		char sexo = 'm';
		//boolean o logico : puede tomar dos valores solamente true o false
		
		boolean esCasado = true;
		esCasado = false ;
		
		
		String direccionCorreo = "alexdeassis7@gmail.com";
		
		//Constantes - es un valor inmutable
		
		final int DIASLABORALES = 5;
		//DIASLABORALES = 7 ; ERROR no podemos modificar un valor constante 
		
		//mostramos literales y variables por consola 
		System.out.println("edad del empleado es : " + edadEmpleado);
		
		System.out.println("El precio del producto es " + precioProducto + " ,Gracias por la compra , Vuelvas pronto!");
		
		//solicitamos datos por la entrada estandar del teclado :
		Scanner teclado = new Scanner(System.in);
		int numeroIngresado = 0 ;
		
		System.out.println("ingrese un numero entero por favor ");
		numeroIngresado =  teclado.nextInt();
		System.out.println("Usted ingreso el numero : " + numeroIngresado);
		
		float numeroIngresadoFlotante = 0 ;
		System.out.println("ingrese un numero entero por favor ");
		numeroIngresadoFlotante =  teclado.nextFloat();
		System.out.println("Usted ingreso el numero con coma  : " + numeroIngresadoFlotante);
	
		
		
		String cadena = "alisefnliu721934hnfiouase6ny r 293 fyaerhlv*+/8+95928+2925{}+´+}{+";
		
		
		
	}

}
