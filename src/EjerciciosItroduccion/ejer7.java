package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer7 {

	public static void ejer7(){
//		/Implementar un programa que dado dos números enteros determine cuál es el 
//		mayor y lo muestre por pantalla.
		Scanner sn = new Scanner(System.in);
		Integer numA, numB;
		System.out.println("Ingrese dos numeros enteros para determinar mayor");
		numA = sn.nextInt();
		numB = sn.nextInt();
		if (numA > numB) {
			System.out.println("El numero mayor es = " + numA);
		} else {
			System.out.println("El numero mayor es = " + numB);
		}

	}
}
