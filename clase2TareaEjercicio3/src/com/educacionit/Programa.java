package com.educacionit;

import java.util.Scanner;
//mport javax.swing.JOptionPane; esta libreria la utilizamos para crear las ventanas de Swing

/**
 * 3) un Maestro desea saber que porcentaje de hombres y que porcentaje de
 * mujeres hay en un grupo de estudiantes
 */
public class Programa {

	public static void main(String[] args) {
		
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0;
		float porcentajeHombres = 0, porcentajeMujeres = 0;
		Scanner teclado = new Scanner(System.in);

		// que entra?

		System.out.println("por favor ingrese la cantidad de Mujeres de su aula ");
		numMujeres = teclado.nextFloat();

		System.out.println("por favor ingrese la cantidad de Hombres de su aula ");
		numHombres = teclado.nextFloat();

		// procesamos la informacion
		totalAlumnos = numHombres + numMujeres;
		porcentajeMujeres = numMujeres * 100 / totalAlumnos;
		porcentajeHombres = numHombres * 100 / totalAlumnos;
		
		//que sale ? 
		System.out.println("total alumnos :" + totalAlumnos);
		System.out.println("porcentaje Mujeres :" + porcentajeMujeres);
		System.out.println("porcentaje Hombres : " + porcentajeHombres);

		// conversion de un string a float , toma de datos mediante swing
		// numMujeres = Float.parseFloat(JOptionPane.showInputDialog("por favor ingrese
		// la cantidad de mujeres de su aula "));

		// conversion de un string a int , toma de datos mediante swing
		// int numeroIngresado = Integer.parseInt( JOptionPane.showInputDialog("por
		// favor ingrese numero ") );

		
	}

}
