package com.educacionit;

import java.util.Scanner;
/*
4) Calcular la utilidad que un trabajador recibe en el reparto anual
de utilidades si este se le asigna como un porcentaje de su salario 
mensual que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla

Tiempo	Utilidad:
	
Menos de 1 año						5% del salario
1 año o más y menos de 2 años 		7% del salario
2 años o más y menos de 5 años		10% del salario
5 años o más y menos de 10 años		15% del salario
10 años o mas 						20% del salario*/

public class AppPrincipal {

	public static void main(String[] args) {
		// defino mis variables de trabajo
		float utilidad = 0, salarioMensual = 0, antiguedad = 0;
		Scanner teclado = new Scanner(System.in);
		// Que entra?
		System.out.println("Ingrese por favor su salario mensual");
		salarioMensual = teclado.nextFloat();

		System.out.println("Ingrese por favor su antiguedad en la empresa");
		antiguedad = teclado.nextFloat();

		// procesamos la informacion
		if (antiguedad < 1) {// Menos de 1 año 5% del salario
			utilidad = salarioMensual * 0.05f;
		} else if ((antiguedad >= 1) && (antiguedad < 2)) {// 1 año o más y menos de 2 años 7% del salario
			utilidad = salarioMensual * 0.07f;
		} else if ((antiguedad >= 2) && (antiguedad < 5)) {// 2 años o más y menos de 5 años 10% del salario
			utilidad = salarioMensual * 0.10f;
		} else if ((antiguedad >= 5) && (antiguedad < 10)) {// 5 años o más y menos de 10 años 15% del salario
			utilidad = salarioMensual * 0.15f;
		} else {// 10 años o mas 20% del salario
			utilidad = salarioMensual * 0.20f;
		}

		System.out.println("su utilidad sera de : " + utilidad);

	}

}
