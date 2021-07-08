package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer2 {

	public static void ejer2(){

//				 Escribir un programa que pida dos números enteros por teclado y calcule la suma 
//				de los dos. El programa deberá después mostrar el resultado de la suma
		Scanner sn = new Scanner(System.in);
		Integer a, b, suma;
		System.out.println("Ingrese dos numeros enteros");
		a = sn.nextInt();
		b = sn.nextInt();
		suma = (a + b);
		System.out.println("La suma de " + a + " mas " + b + " es = " + suma);

	}

}
